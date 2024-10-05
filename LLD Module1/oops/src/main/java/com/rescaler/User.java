package com.rescaler;

import lombok.Getter;

@Getter
public class User {
    // Base class which is shared between it's child classes
    Integer id;
    String name;
    String email;
    String pno;

    protected User(Integer id, String name, String email,String pno){
        this.id=id;
        this.name=name;
        this.email=email;
        this.pno=pno;
    }
    User(Integer id){

    }

    void printDetails(){
        System.out.println(this.id+" "+this.name+" "+this.email);
    }
   protected String getContact(){
        if(this.pno==null){
            return this.email;
        }
        return this.pno;
    }
}
