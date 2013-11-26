package ru.spbstu.dbms.core.query_validator;

/**
 * User: Zeelony
 * Date: 26.11.13
 * Time: 20:53
 */
public class QueryValidator {
    private static QueryValidator ourInstance = new QueryValidator();

    public static QueryValidator getInstance() {
        return ourInstance;
    }

    private QueryValidator() {
    }


}
