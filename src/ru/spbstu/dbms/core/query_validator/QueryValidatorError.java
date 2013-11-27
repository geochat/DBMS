package ru.spbstu.dbms.core.query_validator;

/**
 * Класс, описывающий ошибку при обработке запроса модулем QueryValidator
 * User: Zeelony
 * Date: 27.11.13
 * Time: 15:42
 */
public class QueryValidatorError {
    private QueryValidatorErrorType type;
    private String message;

    /**
     * @param type тип ошибки из enum QueryValidatorErrorType
     * @param message текстовое описание ошибки (на усмотрение разработчика)
     */
    QueryValidatorError(QueryValidatorErrorType type, String message) {
        this.type = type;
        this.message = message;
    }

    /*--------GETTERS/SETTERS------------------------------------------------------------------------------------*/

    QueryValidatorErrorType getType() {
        return type;
    }

    String getMessage() {
        return message;
    }

    void setMessage(String message) {
        this.message = message;
    }
}
