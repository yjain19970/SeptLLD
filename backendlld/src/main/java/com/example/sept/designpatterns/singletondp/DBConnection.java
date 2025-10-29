package com.example.sept.designpatterns.singletondp;

public class DBConnection {
    private static DBConnection INSTANCE = null;
    private String url;
    private String username;
    private String pwd;

    private DBConnection() {
    }

    /**
     * Method to create singleton instance for DBConnection.
     * This is not thread safe.
     */
    public static DBConnection createInstance() {
        if (INSTANCE == null) {
            return INSTANCE = new DBConnection();
        }
        return INSTANCE;
    }
}
