package com.HowellV.inheritance;

/**
 * Created by Howell on 2015/10/30.
 */
public class Manager extends Employee{
    private long bonus;
    private String position;

    public Manager(String n, long s) {
        super(n, s);
    }

    public  String getName(){
        return name+position;
    }

    public long getSalary(){
        long baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(long b){
        bonus = b;
    }

    public void setPosition(String p){
        position = p;
    }
}
