package com.example.sept.designpatterns.singletondp.multithreaded;

public class MultithreadedDBConn {
    private static MultithreadedDBConn INSTANCE = null;
    private String url;
    private String username;
    private String pwd;

    private MultithreadedDBConn() {
    }

    // Multi threaded way of singleton dp.
    public static MultithreadedDBConn createInstance() {
        if(INSTANCE == null){
            synchronized(MultithreadedDBConn.class){
                // This is the 2nd check that we do.
                // Hence called: Double check locking.
                if(INSTANCE ==null){
                    INSTANCE = new MultithreadedDBConn();
                    return INSTANCE;
                }
            }
        }
        return INSTANCE;
    }
    
}
