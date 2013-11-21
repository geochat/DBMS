package ru.spbstu.dbms;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Zeelony
 * Date: 21.11.13
 * Time: 17:25
 * To change this template use File | Settings | File Templates.
 */
public class Cortege {
    public Map<String, String> getCourtage() {
        return courtage;
    }

    /**
     * <p>Добавляет атрибут в кортеж</p>
     * @param name Имя атрибута
     */
    public void addAttribute(String name) {
        courtage.put(name, null);
    }

    /**
     * <p>Удаляет атрибут из кортежа</p>
     * @param name Имя атрибута
     */
    public void removeAttribute(String name) {
        courtage.remove(name);
    }

    /**
     * ЫЫЫЫЫыыыы!
     */
    private final Map<String, String> courtage = new HashMap<String, String>();
}
