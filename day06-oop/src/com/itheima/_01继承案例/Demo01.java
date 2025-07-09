package com.itheima._01继承案例;

/**
 * @Description Demo01
 * @Author jeanAulis
 * @Date 2025-07-09
 */
public class Demo01 {
    public static void main(String[] args) {

        Teacher t = new Teacher();
        t.setName("路小雨");
        t.setSkill("Java");

        Consultant c = new Consultant();
        c.setName("小王");
        c.setNumber("123456");

        System.out.println(t.getName() + " " + t.getSkill());
        System.out.println(c.getName() + " " + c.getNumber());
    }
}
