package com.company.inheritance;

/**
 * Created by Howell on 2015/10/30.
 */
public class ManagerTest {
    public static void main(String args[]){
        Manager boss = new Manager("Jobs",88888,1959,1,1);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Zed",50000,1997,6,21);
        staff[2] = new Employee("Venn",40000,1949,10,1);

        for (Employee e : staff)
            System.out.println("姓名:" + e.getName() + ", 薪水:" + e.getSalary());

    }
}
