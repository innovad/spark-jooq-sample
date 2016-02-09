/**
 * This class is generated by jOOQ
 */
package ch.aranea.db.generated.information_schema.tables.pojos;


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
public class FunctionColumns implements Serializable {

	private static final long serialVersionUID = -791296963;

	private String  aliasCatalog;
	private String  aliasSchema;
	private String  aliasName;
	private String  javaClass;
	private String  javaMethod;
	private Integer columnCount;
	private Integer pos;
	private String  columnName;
	private Integer dataType;
	private String  typeName;
	private Integer precision;
	private Short   scale;
	private Short   radix;
	private Short   nullable;
	private Short   columnType;
	private String  remarks;
	private String  columnDefault;

	public FunctionColumns() {}

	public FunctionColumns(FunctionColumns value) {
		this.aliasCatalog = value.aliasCatalog;
		this.aliasSchema = value.aliasSchema;
		this.aliasName = value.aliasName;
		this.javaClass = value.javaClass;
		this.javaMethod = value.javaMethod;
		this.columnCount = value.columnCount;
		this.pos = value.pos;
		this.columnName = value.columnName;
		this.dataType = value.dataType;
		this.typeName = value.typeName;
		this.precision = value.precision;
		this.scale = value.scale;
		this.radix = value.radix;
		this.nullable = value.nullable;
		this.columnType = value.columnType;
		this.remarks = value.remarks;
		this.columnDefault = value.columnDefault;
	}

	public FunctionColumns(
		String  aliasCatalog,
		String  aliasSchema,
		String  aliasName,
		String  javaClass,
		String  javaMethod,
		Integer columnCount,
		Integer pos,
		String  columnName,
		Integer dataType,
		String  typeName,
		Integer precision,
		Short   scale,
		Short   radix,
		Short   nullable,
		Short   columnType,
		String  remarks,
		String  columnDefault
	) {
		this.aliasCatalog = aliasCatalog;
		this.aliasSchema = aliasSchema;
		this.aliasName = aliasName;
		this.javaClass = javaClass;
		this.javaMethod = javaMethod;
		this.columnCount = columnCount;
		this.pos = pos;
		this.columnName = columnName;
		this.dataType = dataType;
		this.typeName = typeName;
		this.precision = precision;
		this.scale = scale;
		this.radix = radix;
		this.nullable = nullable;
		this.columnType = columnType;
		this.remarks = remarks;
		this.columnDefault = columnDefault;
	}

	public String getAliasCatalog() {
		return this.aliasCatalog;
	}

	public void setAliasCatalog(String aliasCatalog) {
		this.aliasCatalog = aliasCatalog;
	}

	public String getAliasSchema() {
		return this.aliasSchema;
	}

	public void setAliasSchema(String aliasSchema) {
		this.aliasSchema = aliasSchema;
	}

	public String getAliasName() {
		return this.aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public String getJavaClass() {
		return this.javaClass;
	}

	public void setJavaClass(String javaClass) {
		this.javaClass = javaClass;
	}

	public String getJavaMethod() {
		return this.javaMethod;
	}

	public void setJavaMethod(String javaMethod) {
		this.javaMethod = javaMethod;
	}

	public Integer getColumnCount() {
		return this.columnCount;
	}

	public void setColumnCount(Integer columnCount) {
		this.columnCount = columnCount;
	}

	public Integer getPos() {
		return this.pos;
	}

	public void setPos(Integer pos) {
		this.pos = pos;
	}

	public String getColumnName() {
		return this.columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public Integer getDataType() {
		return this.dataType;
	}

	public void setDataType(Integer dataType) {
		this.dataType = dataType;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Integer getPrecision() {
		return this.precision;
	}

	public void setPrecision(Integer precision) {
		this.precision = precision;
	}

	public Short getScale() {
		return this.scale;
	}

	public void setScale(Short scale) {
		this.scale = scale;
	}

	public Short getRadix() {
		return this.radix;
	}

	public void setRadix(Short radix) {
		this.radix = radix;
	}

	public Short getNullable() {
		return this.nullable;
	}

	public void setNullable(Short nullable) {
		this.nullable = nullable;
	}

	public Short getColumnType() {
		return this.columnType;
	}

	public void setColumnType(Short columnType) {
		this.columnType = columnType;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getColumnDefault() {
		return this.columnDefault;
	}

	public void setColumnDefault(String columnDefault) {
		this.columnDefault = columnDefault;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("FunctionColumns (");

		sb.append(aliasCatalog);
		sb.append(", ").append(aliasSchema);
		sb.append(", ").append(aliasName);
		sb.append(", ").append(javaClass);
		sb.append(", ").append(javaMethod);
		sb.append(", ").append(columnCount);
		sb.append(", ").append(pos);
		sb.append(", ").append(columnName);
		sb.append(", ").append(dataType);
		sb.append(", ").append(typeName);
		sb.append(", ").append(precision);
		sb.append(", ").append(scale);
		sb.append(", ").append(radix);
		sb.append(", ").append(nullable);
		sb.append(", ").append(columnType);
		sb.append(", ").append(remarks);
		sb.append(", ").append(columnDefault);

		sb.append(")");
		return sb.toString();
	}
}
