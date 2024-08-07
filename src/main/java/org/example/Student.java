package org.example;

public class Student {
    public int age;
    public float psp;
    public String name;

    public void changeBatch(){
        System.out.println("Changing batch");
    }
    public void joinClass(){
        System.out.println(name+" is joining class");
    }
    public void printDetails(){
        System.out.println("Name is "+ name);
        System.out.println("Age is "+ age);
        System.out.println("psp is "+ psp);
    }
}
