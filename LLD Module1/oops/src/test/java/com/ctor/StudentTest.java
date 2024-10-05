package com.ctor;

public class StudentTest {

    public static void swap(Student s1, Student s2){
        Student temp=s1;
        s1=s2;
        s2=s1;
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age=24;
        s1.name="Anshul";

        Student s2 = new Student();
        s2.age=14;
        s2.name="Nonu";

        //Java is call by value so a copy of s1, s2 address is send and hence the changes will
        // be local to fun swap and s1 will still points to the original s1 address
        swap(s1,s2);

        s1.display();
    }
}
