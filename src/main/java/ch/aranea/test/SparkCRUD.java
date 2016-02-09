package ch.aranea.test;
/**
 * Copyright (c) 2009-2016, Data Geekery GmbH (http://www.datageekery.com)
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */


import static spark.Spark.delete;
import static spark.Spark.get;
import static spark.Spark.post;
import static spark.Spark.put;

import static ch.aranea.db.generated.public_.Tables .AUTHOR;
import static ch.aranea.db.generated.public_.Tables.BOOK;

import java.util.Properties;
import java.util.stream.Collectors;

import org.apache.commons.dbcp.BasicDataSource;
import org.jooq.DSLContext;
import org.jooq.Record2;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import ch.aranea.db.generated.public_.tables.records.AuthorRecord;
import ch.aranea.db.generated.public_.tables.records.BookRecord;
import spark.Request;

/**
 * A simple CRUD example showing howto create, get, update and delete book resources.
 */
public class SparkCRUD {

    public static void main(String[] args) throws Exception {
        final BasicDataSource ds = new BasicDataSource();

        ds.setDriverClassName("org.h2.Driver");
        ds.setUrl("jdbc:h2:tcp://localhost/~/test");
        ds.setUsername("sa");
        ds.setPassword("");

        final DSLContext ctx = DSL.using(ds, SQLDialect.H2);

        // Creates a new book resource, will return the ID to the created resource
        // author and title are sent as query parameters e.g. /books?author=Foo&title=Bar
        post("/books", (request, response) -> {
            AuthorRecord author = upsertAuthor(ctx, request);

            BookRecord book = ctx.newRecord(BOOK);
            book.setAuthorId(author.getId());
            book.setTitle(request.queryParams("title"));
            book.store();

            response.status(201); // 201 Created
            return book.getId();
        });

        // Gets the book resource for the provided id
        get("/books/:id", (request, response) -> {
            Record2<String, String> book = ctx
                .select(BOOK.TITLE, AUTHOR.NAME)
                .from(BOOK)
                .join(AUTHOR).on(BOOK.AUTHOR_ID.eq(AUTHOR.ID))
                .where(BOOK.ID.eq(BOOK.ID.getDataType().convert(request.params(":id"))))
                .fetchOne();

            if (book != null) {
                return "Title: " + book.value1() + ", Author: " + book.value2();
            }
            else {
                response.status(404); // 404 Not found
                return "Book not found";
            }
        });

        // Updates the book resource for the provided id with new information
        // author and title are sent as query parameters e.g. /books/<id>?author=Foo&title=Bar
        put("/books/:id", (request, response) -> {
            BookRecord book = ctx
                .selectFrom(BOOK)
                .where(BOOK.ID.eq(BOOK.ID.getDataType().convert(request.params(":id"))))
                .fetchOne();

            if (book != null) {
                AuthorRecord author = upsertAuthor(ctx, request);

                String newAuthor = request.queryParams("author");
                String newTitle = request.queryParams("title");

                if (newAuthor != null) {
                    book.setAuthorId(author.getId());
                }
                if (newTitle != null) {
                    book.setTitle(newTitle);
                }

                book.update();
                return "Book with id '" + book.getId() + "' updated";
            }
            else {
                response.status(404); // 404 Not found
                return "Book not found";
            }
        });

        // Deletes the book resource for the provided id
        delete("/books/:id", (request, response) -> {
            BookRecord book = ctx
                .deleteFrom(BOOK)
                .where(BOOK.ID.eq(BOOK.ID.getDataType().convert(request.params(":id"))))
                .returning()
                .fetchOne();

            if (book != null) {
                return "Book with id '" + book.getId() + "' deleted";
            }
            else {
                response.status(404); // 404 Not found
                return "Book not found";
            }
        });

        // Gets all available book resources
        get("/books", (request, response) -> {
            return ctx.selectFrom(BOOK).fetch().formatJSON();
        });
    }

    private static AuthorRecord upsertAuthor(final DSLContext ctx, Request request) {
        AuthorRecord author = ctx
            .selectFrom(AUTHOR)
            .where(AUTHOR.NAME.eq(request.queryParams("author")))
            .fetchOne();

        if (author == null)
            author = ctx.newRecord(AUTHOR);

        author.setName(request.queryParams("author"));
        author.store();

        return author;
    }
}