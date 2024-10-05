package com.rescaler.subscaler;

import com.rescaler.User;

public class TA extends User {
    Integer yearOfExperience;
    public TA(Integer id, String name, String email, String pno,Integer yearOfExperience){
        super(id,name,email,pno);
        this.yearOfExperience=yearOfExperience;
    }

    @Override
    public String getContact(){
        String contact = super.getContact();
        if(contact==null){
            throw  new RuntimeException("Contact Details not found");
        }
        return contact;

    }
}
