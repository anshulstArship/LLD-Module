package com.rescaler;

import java.util.ArrayList;
import java.util.List;

public class Mentor extends User{

    private List<Student> students = new ArrayList<>();
    //always initialize collections else null ptr exception

    public Mentor(Integer id, String name,String email,List<Student> students){
        // by default, default ctr is called
       super(id,name,email,null);
        this.students=students;
    }

    public Mentor(Integer id, String name, String email){ // compile type polymorphism
        super(id);
    }
    public Mentor(Integer id){
        super(id);
        System.out.println("Integer called");
    }
    public Mentor(int id){
        super(id);
        System.out.println("int called");
    }


}
