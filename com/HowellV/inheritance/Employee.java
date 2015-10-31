package com.HowellV.inheritance;


/**
 * Created by Howell on 2015/10/30.
 */
public class Employee {
     String name;
    private long salary;

    public Employee(String n, long s){
        name = n;
        salary = s;
    }

    public  String getName(){
        return name;
    }
    public long getSalary(){
        return salary;
    }
}
