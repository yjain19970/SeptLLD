package com.example.sept.designpatterns.prototypeAndRegistry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    
    private static Map<String, Student> studentRegistryMap = new HashMap<>();

    public static void register(String keyString, Student value) throws Exception{
        if(!studentRegistryMap.containsKey(keyString)){
            studentRegistryMap.put(keyString, value);
            return;
        }
        throw new Exception("Key already present!");
    }

    public static Student getStudentTemplate(String key) throws Exception{
        if(!studentRegistryMap.containsKey(key)){
            throw new Exception("Key not present!");
        }
        return studentRegistryMap.get(key);
    }

}
