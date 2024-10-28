package com.creational.builder;

import lombok.Data;
import java.lang.*;

public class Database {
    private String name;
    private String userName;
    private String password;
    private DatabaseType type;
    private boolean isCompressed;
    private Integer port;

    private Database(){

    }
    public static Builder builder() {
        return new Builder();
    }


    // Step 1 - Create Inner class
    public static class Builder{
       private Database database;

       public Builder(){
           database=new Database();
       }


// Fluent Interfaces - Allow us to chain methods
        public Builder name(String name) {
            database.name = name;
            return this;
        }

        public Builder withCredentials(String userName,String password) {
            database.userName = userName;
            database.password=password;
            return this;
        }

        public Builder setPassword(String password) {
            database.password = password;
            return this;
        }

        public Builder setType(DatabaseType type) {
            database.type = type;
            return this;
        }
        public Builder mySql(){
            database.type=DatabaseType.MYSQL;
            return this;
        }

        public Builder setCompressed() {
            database.isCompressed = true;
            return this;
        }
        public Database build(){
            Database newdatabase = new Database();
//            if(!isValidate()){
//                throw new IllegalArgumentException("Bad type");
//            }
            newdatabase.name=database.name;
            newdatabase.password=database.password;
            newdatabase.isCompressed=database.isCompressed;
            newdatabase.userName=database.userName;
            newdatabase.type=database.type;
            return newdatabase;
        }
        private boolean isValidate(){
            if(database.type==DatabaseType.MYSQL){
                return false;
            }
            return true;
        }


    }
}
