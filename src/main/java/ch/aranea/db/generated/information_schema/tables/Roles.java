/**
 * This class is generated by jOOQ
 */
package ch.aranea.db.generated.information_schema.tables;


import ch.aranea.db.generated.information_schema.InformationSchema;
import ch.aranea.db.generated.information_schema.tables.records.RolesRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


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
public class Roles extends TableImpl<RolesRecord> {

	private static final long serialVersionUID = -1295161703;

	/**
	 * The reference instance of <code>INFORMATION_SCHEMA.ROLES</code>
	 */
	public static final Roles ROLES = new Roles();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<RolesRecord> getRecordType() {
		return RolesRecord.class;
	}

	/**
	 * The column <code>INFORMATION_SCHEMA.ROLES.NAME</code>.
	 */
	public final TableField<RolesRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROLES.REMARKS</code>.
	 */
	public final TableField<RolesRecord, String> REMARKS = createField("REMARKS", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROLES.ID</code>.
	 */
	public final TableField<RolesRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>INFORMATION_SCHEMA.ROLES</code> table reference
	 */
	public Roles() {
		this("ROLES", null);
	}

	/**
	 * Create an aliased <code>INFORMATION_SCHEMA.ROLES</code> table reference
	 */
	public Roles(String alias) {
		this(alias, ROLES);
	}

	private Roles(String alias, Table<RolesRecord> aliased) {
		this(alias, aliased, null);
	}

	private Roles(String alias, Table<RolesRecord> aliased, Field<?>[] parameters) {
		super(alias, InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Roles as(String alias) {
		return new Roles(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Roles rename(String name) {
		return new Roles(name, null);
	}
}
