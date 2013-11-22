package ru.spbstu.dbms.core;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Zeelony
 * Date: 21.11.13
 * Time: 17:25
 * To change this template use File | Settings | File Templates.
 */
class Cortege {

    private final Map<String, String> cortege = new HashMap<String, String>();
    private Integer internalID;

    /**
     * <p>Добавляет атрибут в кортеж</p>
     * @param name Имя атрибута
     */
    public void addAttribute(String name) {
        cortege.put(name, null);
    }

    /**
     * <p>Удаляет атрибут из кортежа</p>
     * @param name Имя атрибута
     */
    public void removeAttribute(String name) {
        cortege.remove(name);
    }

    /*--------GETTERS------------------------------------------------------------------------------------*/

    public Map<String, String> getCortege() {
        return cortege;
    }
}
