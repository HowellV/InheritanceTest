package com.company.inheritance;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Howell on 2015/10/30.
 */
public class Employee {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String n, double s, int year, int month, int day){
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
        hireDay = calendar.getTime();
    }

    public  String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public Date getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent /100;
        salary += raise;
    }
}
