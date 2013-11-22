package ru.spbstu.dbms.core;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Zeelony
 * Date: 21.11.13
 * Time: 18:43
 * To change this template use File | Settings | File Templates.
 */
class Database {

    private final Map<String, Table>tables = new HashMap<String, Table>();

    /**
     * Добавляет таблицу в базу данных
     * @param name Имя табилцы
     * @param attributes Атрибуты таблицы в форме имя:тип
     * @return true, если таблица успешно создана, и false, если таблица с таким именем уже сущетсвует
     */
    public Boolean addTable(String name, Map<String,DataType>attributes) {
        if (tables.containsKey(name))
            return false;
        Table table = new Table(attributes);
        this.tables.put(name, table);
        return true;
    }

    /**
     * Удаляет табилцу из базы данных
     * @param name Имя табилцы
     * @return true, если таблица успешно удалена, и false, если таблица с таким именем не сущетсвует
     */
    public Boolean removeTable(String name) {
        if (tables.remove(name) == null)
            return false;
        return true;
    }

    /*--------GETTERS------------------------------------------------------------------------------------*/

    Map<String, Table> getTables() {
        return tables;
    }
}
