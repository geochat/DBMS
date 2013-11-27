package ru.spbstu.dbms.core.query_validator;

import ru.spbstu.dbms.query.Query;

/**
 * Лексический валидатор запроса
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

    /**
     * Метод, осуществляющий валидацию запроса
     * @param query объект запроса, валидацию которого необходимо провести
     * @return объект-ответ
     */
    public QueryValidatorResponse validate(Query query) {

        return null;
    }
}
