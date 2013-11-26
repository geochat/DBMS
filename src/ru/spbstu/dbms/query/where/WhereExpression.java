package ru.spbstu.dbms.query.where;

/**
 * Created with IntelliJ IDEA.
 * User: Zeelony
 * Date: 26.11.13
 * Time: 19:13
 * To change this template use File | Settings | File Templates.
 */
public class WhereExpression {
    /**
     * имя атрибута
     */
    String fieldName;
    /**
     * операция отношения атрибута и значения
     */
    WhereOp operation;
    /**
     * значение в отношении
     */
    String value;

    public WhereExpression(String fieldName, WhereOp operation, String value) {
        this.fieldName = fieldName;
        this.operation = operation;
        this.value = value;
    }
}
