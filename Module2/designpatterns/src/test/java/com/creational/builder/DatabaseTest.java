package com.creational.builder;

public class DatabaseTest {
    public static void main(String[] args) {
        Database database = Database.builder().
                name("dummy").
                mySql().
                withCredentials("abc","123").
               setCompressed().build();
        //System.out.println(database.);
    }
}
