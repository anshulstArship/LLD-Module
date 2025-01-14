package com.creational;

public class ConnectionPool {

    private static ConnectionPool INSTANCE;
   // private static ConnectionPool eagerInstance = new ConnectionPool(); // eager initialization
    // creating object when class is loaded
    // can't have dynamic attributes

    private ConnectionPool(){

    }
// Global access point
    public static ConnectionPool getInstance(){
        // Double check locking
       if(INSTANCE==null){
           synchronized (ConnectionPool.class){
               if(INSTANCE==null){
                   INSTANCE = new ConnectionPool(); // Lazy Initialization (creates objects on demand)
               }
           }
       }
       return INSTANCE;
    }
}
