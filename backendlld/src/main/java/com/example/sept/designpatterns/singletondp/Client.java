package com.example.sept.designpatterns.singletondp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.example.sept.designpatterns.singletondp.multithreaded.MultithreadedDBConn;

public class Client {
    public static void main(String[] args) {
      DBConnection conn =   DBConnection.createInstance();
      System.out.println("conn: " + conn);

      DBConnection conn2 =   DBConnection.createInstance();
      System.out.println("conn2: " + conn2);


      MultithreadedDBConn dbConn1 = MultithreadedDBConn.createInstance();
      MultithreadedDBConn dbConn2 = MultithreadedDBConn.createInstance();

      ExecutorService service = Executors.newCachedThreadPool();
      

      System.out.println("dbConn1: " + dbConn1);
      System.out.println("dbConn2: " + dbConn2);
    }
}
