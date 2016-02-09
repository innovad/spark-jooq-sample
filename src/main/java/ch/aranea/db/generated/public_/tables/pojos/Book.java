/**
 * This class is generated by jOOQ
 */
package ch.aranea.db.generated.public_.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class Book implements Serializable {

	private static final long serialVersionUID = -1271610574;

	private Integer id;
	private Integer authorId;
	private String  title;

	public Book() {}

	public Book(Book value) {
		this.id = value.id;
		this.authorId = value.authorId;
		this.title = value.title;
	}

	public Book(
		Integer id,
		Integer authorId,
		String  title
	) {
		this.id = id;
		this.authorId = authorId;
		this.title = title;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAuthorId() {
		return this.authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Book (");

		sb.append(id);
		sb.append(", ").append(authorId);
		sb.append(", ").append(title);

		sb.append(")");
		return sb.toString();
	}
}