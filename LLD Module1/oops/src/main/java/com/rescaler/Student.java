package com.rescaler;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Student extends User{

    private static final String PREFIX="S";
    //state

    private String batchName;
    private Integer psp;
    private StudentStatus studentStatus;
    // problem with status string - Anything can be set to string,but we have predefined list of status
    // enum is defined(can have only set of values)

    public Student(Integer id,String name,String email,String batchName,Integer psp,String pno){
        super(id,name,email,pno);
        if(psp<0 || psp>100){
            throw new IllegalArgumentException("Invalid psp");
        }
        this.psp=psp;
        this.batchName=batchName;
        this.studentStatus=StudentStatus.ACTIVE;
    }

    // behaviours
    void setStatus(StudentStatus status){
        //active, paused
        this.studentStatus=status;
    }

     String getRollNumber(){
        return PREFIX+"_"+batchName+"_"+id;
    }

    public static String generateRollNumber(){
        // can access static state only
        return null;
    }

    // not dependent on state
    // utility methods
   public static String toString(Student student){
        String str = student.getName()+" "+student.getRollNumber();
       System.out.println(str);
       return str;
   }

   public String toString(){
       System.out.println(this.name);
       // code duplication
       // return this.getName()+" "+this.getRollNumber();
       return toString(this);
   }

   @Override
   public void printDetails(){
        super.printDetails();
       System.out.println(" "+this.batchName);
   }




}
