package com.HowellV.inheritance;
/**
 * Created by Howell on 2015/10/30.
 */
public class ManagerTest {
    public static void main(String args[]){
        /**
         *高贵的boss可是有奖金的！！！
         */
        Manager boss = new Manager("Howell",8888888);//没错儿，就是我。
        boss.setBonus(1111);//睾层有奖金（光棍节快乐。
        boss.setPosition(" (CEO)");


        Employee[] staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Bill Gates",2333);
        staff[2] = new Employee("Tim Cook",450);

        System.out.println("脑洞大开之我的公司员工\n------------------------------------");

        for (Employee i : staff)
            System.out.println("姓名: " + i.getName() + ",  年薪: $" + i.getSalary());

    }
}
