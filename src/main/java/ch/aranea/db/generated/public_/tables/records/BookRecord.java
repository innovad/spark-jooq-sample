/**
 * This class is generated by jOOQ
 */
package ch.aranea.db.generated.public_.tables.records;


import ch.aranea.db.generated.public_.tables.Book;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class BookRecord extends UpdatableRecordImpl<BookRecord> implements Record3<Integer, Integer, String> {

	private static final long serialVersionUID = -2090000382;

	/**
	 * Setter for <code>PUBLIC.BOOK.ID</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>PUBLIC.BOOK.ID</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.BOOK.AUTHOR_ID</code>.
	 */
	public void setAuthorId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>PUBLIC.BOOK.AUTHOR_ID</code>.
	 */
	public Integer getAuthorId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>PUBLIC.BOOK.TITLE</code>.
	 */
	public void setTitle(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>PUBLIC.BOOK.TITLE</code>.
	 */
	public String getTitle() {
		return (String) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, Integer, String> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, Integer, String> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Book.BOOK.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Book.BOOK.AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Book.BOOK.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getAuthorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BookRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BookRecord value2(Integer value) {
		setAuthorId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BookRecord value3(String value) {
		setTitle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BookRecord values(Integer value1, Integer value2, String value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached BookRecord
	 */
	public BookRecord() {
		super(Book.BOOK);
	}

	/**
	 * Create a detached, initialised BookRecord
	 */
	public BookRecord(Integer id, Integer authorId, String title) {
		super(Book.BOOK);

		setValue(0, id);
		setValue(1, authorId);
		setValue(2, title);
	}
}
