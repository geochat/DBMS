package ru.spbstu.dbms.query;

import ru.spbstu.dbms.query.where.WhereExpression;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Класс, описывающий запрос из API к Core.
 * User: Zeelony
 * Date: 21.11.13
 * Time: 20:25
 */
public class Query {
    /**
     * Тип запроса
     */
    private QueryType queryType;
    /**
     * имя БД
     */
    private String databaseName;
    /**
     * имя таблицы внутри БД
     */
    private String tableName;
    /**
     * запрашиваемые поля таблицы (ключи) и значения (если требуются, в зависимости от типа запроса)
     */
    private final HashMap<String,String> requiredFields = new HashMap<String, String>();
    /**
     * коллекция выражений, используемых в WHERE. Все выражения объединяются через логическое И.
     */
    private final HashSet<WhereExpression> whereExpressions = new HashSet<WhereExpression>();

    /**
     * Конструктор
     * @param queryType Тип запроса
     * @param databaseName имя БД
     * @param tableName имя таблицы внутри БД
     * @param requiredFields запрашиваемые поля таблицы (ключи) и значения (если требуются, в зависимости от типа запроса)
     * @param whereExpressions коллекция выражений, используемых в WHERE. Все выражения объединяются через логическое И.
     */
    public Query(QueryType queryType, String databaseName, String tableName, HashMap<String,String> requiredFields,  HashSet<WhereExpression> whereExpressions) {
        this.queryType = queryType;
        this.databaseName = databaseName;
        this.tableName = tableName;
        this.requiredFields.putAll(requiredFields);
        this.whereExpressions.addAll(whereExpressions);
    }
}
