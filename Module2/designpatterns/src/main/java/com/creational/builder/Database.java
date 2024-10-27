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
        private String name;
        private String userName;
        private String password;
        private DatabaseType type;
        private boolean isCompressed;
        private Integer port;


// Fluent Interfaces - Allow us to chain methods
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder withCredentials(String userName,String password) {
            this.userName = userName;
            this.password=password;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setType(DatabaseType type) {
            this.type = type;
            return this;
        }
        public Builder mySql(){
            this.type=DatabaseType.MYSQL;
            return this;
        }

        public Builder setCompressed() {
            this.isCompressed = true;
            return this;
        }
        public Database build(){
            Database database = new Database();
//            if(!isValidate()){
//                throw new IllegalArgumentException("Bad type");
//            }
            database.name=name;
            database.password=password;
            database.isCompressed=isCompressed;
            database.userName=userName;
            database.type=type;
            return database;
        }
        private boolean isValidate(){
            if(type==DatabaseType.MYSQL){
                return false;
            }
            return true;
        }


    }
}
