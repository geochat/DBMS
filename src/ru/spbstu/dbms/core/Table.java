package ru.spbstu.dbms.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Zeelony
 * Date: 21.11.13
 * Time: 17:03
 * To change this template use File | Settings | File Templates.
 */
class Table {

    private final Map<String, DataType> attributes = new HashMap<String, DataType>();
    private final ArrayList<Cortege> corteges = new ArrayList<Cortege>();

    /**
     * Конструктор таблицы
     * @param attributes Атрибуты таблицы в форме имя:тип
     */
    public Table(Map<String, DataType>attributes) {
        this.attributes.putAll(attributes);
    }

    /**
     * <p>Добавляет атрибут в структуру таблицы и во все ее кортежи</p>
     * @param name Имя атрибута
     * @param type Тип атрибута DataType
     * @return true, если атрибут успешно добавлен и false, если атрибут с таким именем уже существует
     */
    Boolean addAttribute(String name, DataType type) {
        if (attributes.put(name, type) == null)
            return false;
        for (Cortege cortege : corteges) {
            cortege.addAttribute(name);
        }
        return true;
    }

    /**
     * <p>Удаляет атрибут из структуры таблицы и из всех ее кортежей</p>
     * @param name Имя атрибута
     * @return true, если атрибут успешно удален и false, если атрибута с таким именем не существует
     */
    Boolean removeAttribute(String name) {
        if (attributes.remove(name) == null)
            return false;
        for (Cortege cortege : corteges) {
            cortege.removeAttribute(name);
        }
        return true;
    }

    Boolean addCortege(){
        return true;
    }

    /*--------GETTERS------------------------------------------------------------------------------------*/

    Map<String, DataType> getAttributes() {
        return attributes;
    }

    ArrayList<Cortege> getCorteges() {
        return corteges;
    }

}
