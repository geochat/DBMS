package ru.spbstu.dbms.core.query_validator;

import java.util.ArrayList;

/**
 * Класс, описывающий выходные данные из модуля лексического анализа запроса.
 * Если результат лексического анализа положительный (ошибок нет), список ошибок будет пуст
 * User: Zeelony
 * Date: 26.11.13
 * Time: 20:57
 */
public class QueryValidatorResponse {
    /**
     *  Список ошибок, обнаруженных модулем лексического анализа (QueryValidator)
     */
    private final ArrayList<QueryValidatorError> errors = new ArrayList<QueryValidatorError>();
    public void addErrorToList(QueryValidatorError err) {
       this.errors.add(err);
    }
}
