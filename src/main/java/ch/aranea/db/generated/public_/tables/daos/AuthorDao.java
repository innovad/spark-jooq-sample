/**
 * This class is generated by jOOQ
 */
package ch.aranea.db.generated.public_.tables.daos;


import ch.aranea.db.generated.public_.tables.Author;
import ch.aranea.db.generated.public_.tables.records.AuthorRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuthorDao extends DAOImpl<AuthorRecord, ch.aranea.db.generated.public_.tables.pojos.Author, Integer> {

	/**
	 * Create a new AuthorDao without any configuration
	 */
	public AuthorDao() {
		super(Author.AUTHOR, ch.aranea.db.generated.public_.tables.pojos.Author.class);
	}

	/**
	 * Create a new AuthorDao with an attached configuration
	 */
	public AuthorDao(Configuration configuration) {
		super(Author.AUTHOR, ch.aranea.db.generated.public_.tables.pojos.Author.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(ch.aranea.db.generated.public_.tables.pojos.Author object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public List<ch.aranea.db.generated.public_.tables.pojos.Author> fetchById(Integer... values) {
		return fetch(Author.AUTHOR.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public ch.aranea.db.generated.public_.tables.pojos.Author fetchOneById(Integer value) {
		return fetchOne(Author.AUTHOR.ID, value);
	}

	/**
	 * Fetch records that have <code>NAME IN (values)</code>
	 */
	public List<ch.aranea.db.generated.public_.tables.pojos.Author> fetchByName(String... values) {
		return fetch(Author.AUTHOR.NAME, values);
	}
}
