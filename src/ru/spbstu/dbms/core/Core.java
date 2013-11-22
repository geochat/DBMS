package ru.spbstu.dbms.core;

import java.util.Map;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: Zeelony
 * Date: 21.11.13
 * Time: 19:20
 * To change this template use File | Settings | File Templates.
 */
public class Core {
    /**
     * singleton instance
     */
    private static volatile Core instance;

    /**
     * Геттер синглтон инстанса
     * @return инстанс Core
     */
    public static Core getInstance() {
        Core localInstance = instance;
        if (localInstance == null) {
            synchronized (Core.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Core();
                }
            }
        }
        return localInstance;
    }

    /**
     * HashMap баз данных в форме имя:база
     */
    HashMap<String,Database>databases = new HashMap<String,Database>();

    /*--------GETTERS------------------------------------------------------------------------------------*/

    public Map<String, Database> getDatabases() {
        return databases;
    }


}
