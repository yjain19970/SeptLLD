package com.example.sept.designpatterns.prototypeAndRegistry;

import java.util.HashMap;
import java.util.Map;

public class Database {
    public  static Map<Object, Object> database = new HashMap<>();

    public static Map<Object, Object> getDatabase() {
        return database;
    }

    public static void setDatabase(Student clone) {
        
    }
    
}

