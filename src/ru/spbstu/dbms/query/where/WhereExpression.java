package ru.spbstu.dbms.query.where;

/**
 * Класс, описывающий выражение в условии WHERE.
 * User: Zeelony
 * Date: 26.11.13
 * Time: 19:13
 */
public class WhereExpression {
    /**
     * имя атрибута
     */
    private String fieldName;
    /**
     * операция отношения атрибута и значения
     */
    private WhereOp operation;
    /**
     * значение в отношении
     */
    private String value;

    /**
     * Конструктор
     * @param fieldName имя атрибута
     * @param operation операция отношения атрибута и значения
     * @param value значение в отношении
     */
    public WhereExpression(String fieldName, WhereOp operation, String value) {
        this.fieldName = fieldName;
        this.operation = operation;
        this.value = value;
    }

    /*--------GETTERS------------------------------------------------------------------------------------*/

    public String getFieldName() {
        return fieldName;
    }

    public WhereOp getOperation() {
        return operation;
    }

    public String getValue() {
        return value;
    }
}
