package com.example.sept.designpatterns.singletondp.multithreaded;

/**
 * Lazy Loading way of singleton.
 */
public class EagerLoadingDBConn {
    private static EagerLoadingDBConn INSTANCE = new EagerLoadingDBConn();
    private String url;
    private String username;
    private String pwd;

    private EagerLoadingDBConn() {
    }

    public static EagerLoadingDBConn createInstance() {
        return INSTANCE;
    }
    
}
