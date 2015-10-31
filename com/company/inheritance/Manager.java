package com.company.inheritance;

/**
 * Created by Howell on 2015/10/30.
 */
public class Manager extends Employee {
    private double bonus;

    public Manager(String n, double s, int year, int month, int day){
        super(n, s, year, month, day);
        bonus = 0;
    }

    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double b){
        bonus = b;
    }
}
