package ru.spbstu.dbms.core;

import java.util.HashMap;

/**
 * Класс ядра СУБД.
 * User: Zeelony
 * Date: 27.11.13
 * Time: 16:05
 */
public class Core {
    private static Core ourInstance = new Core();

    public static Core getInstance() {
        return ourInstance;
    }

    private Core() {
    }

    /**
     * HashMap баз данных в форме имя:база
     */
    HashMap<String,Database> databases = new HashMap<String,Database>();

    /*--------GETTERS------------------------------------------------------------------------------------*/

    public HashMap<String, Database> getDatabases() {
        return databases;
    }

}
