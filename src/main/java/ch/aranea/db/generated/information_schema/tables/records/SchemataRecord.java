/**
 * This class is generated by jOOQ
 */
package ch.aranea.db.generated.information_schema.tables.records;


import ch.aranea.db.generated.information_schema.tables.Schemata;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;


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
public class SchemataRecord extends TableRecordImpl<SchemataRecord> implements Record8<String, String, String, String, String, Boolean, String, Integer> {

	private static final long serialVersionUID = -1622944190;

	/**
	 * Setter for <code>INFORMATION_SCHEMA.SCHEMATA.CATALOG_NAME</code>.
	 */
	public void setCatalogName(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.SCHEMATA.CATALOG_NAME</code>.
	 */
	public String getCatalogName() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.SCHEMATA.SCHEMA_NAME</code>.
	 */
	public void setSchemaName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.SCHEMATA.SCHEMA_NAME</code>.
	 */
	public String getSchemaName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.SCHEMATA.SCHEMA_OWNER</code>.
	 */
	public void setSchemaOwner(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.SCHEMATA.SCHEMA_OWNER</code>.
	 */
	public String getSchemaOwner() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.SCHEMATA.DEFAULT_CHARACTER_SET_NAME</code>.
	 */
	public void setDefaultCharacterSetName(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.SCHEMATA.DEFAULT_CHARACTER_SET_NAME</code>.
	 */
	public String getDefaultCharacterSetName() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.SCHEMATA.DEFAULT_COLLATION_NAME</code>.
	 */
	public void setDefaultCollationName(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.SCHEMATA.DEFAULT_COLLATION_NAME</code>.
	 */
	public String getDefaultCollationName() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.SCHEMATA.IS_DEFAULT</code>.
	 */
	public void setIsDefault(Boolean value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.SCHEMATA.IS_DEFAULT</code>.
	 */
	public Boolean getIsDefault() {
		return (Boolean) getValue(5);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.SCHEMATA.REMARKS</code>.
	 */
	public void setRemarks(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.SCHEMATA.REMARKS</code>.
	 */
	public String getRemarks() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.SCHEMATA.ID</code>.
	 */
	public void setId(Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.SCHEMATA.ID</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<String, String, String, String, String, Boolean, String, Integer> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<String, String, String, String, String, Boolean, String, Integer> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return Schemata.SCHEMATA.CATALOG_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Schemata.SCHEMATA.SCHEMA_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Schemata.SCHEMATA.SCHEMA_OWNER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Schemata.SCHEMATA.DEFAULT_CHARACTER_SET_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Schemata.SCHEMATA.DEFAULT_COLLATION_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field6() {
		return Schemata.SCHEMATA.IS_DEFAULT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return Schemata.SCHEMATA.REMARKS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field8() {
		return Schemata.SCHEMATA.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getCatalogName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getSchemaName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getSchemaOwner();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getDefaultCharacterSetName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getDefaultCollationName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value6() {
		return getIsDefault();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getRemarks();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value8() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemataRecord value1(String value) {
		setCatalogName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemataRecord value2(String value) {
		setSchemaName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemataRecord value3(String value) {
		setSchemaOwner(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemataRecord value4(String value) {
		setDefaultCharacterSetName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemataRecord value5(String value) {
		setDefaultCollationName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemataRecord value6(Boolean value) {
		setIsDefault(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemataRecord value7(String value) {
		setRemarks(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemataRecord value8(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemataRecord values(String value1, String value2, String value3, String value4, String value5, Boolean value6, String value7, Integer value8) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SchemataRecord
	 */
	public SchemataRecord() {
		super(Schemata.SCHEMATA);
	}

	/**
	 * Create a detached, initialised SchemataRecord
	 */
	public SchemataRecord(String catalogName, String schemaName, String schemaOwner, String defaultCharacterSetName, String defaultCollationName, Boolean isDefault, String remarks, Integer id) {
		super(Schemata.SCHEMATA);

		setValue(0, catalogName);
		setValue(1, schemaName);
		setValue(2, schemaOwner);
		setValue(3, defaultCharacterSetName);
		setValue(4, defaultCollationName);
		setValue(5, isDefault);
		setValue(6, remarks);
		setValue(7, id);
	}
}
