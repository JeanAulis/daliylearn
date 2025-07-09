package com.itheima._04继承的特点;

/**
 * @Description Demo02
 * @Author jeanAulis
 * @Date 2025-07-09
 */
class Fu3 {
    public String name = "父类名字";

    public void demo(){
        System.out.println("父类demo方法");
    }
}

class Son3 extends Fu3 {
    public String name = "子类名字";

    public void demo(){
        System.out.println("子类的demo方法");
    }

    public void test(){
        String name = "方法内局部变量名字";

        System.out.println("test方法内name的值" + name);
        System.out.println("Son3方法内name的值" + this.name);
        System.out.println("Fu3类里面成员变量name的值" + super.name);
        this.demo();
        super.demo();
    }
}

public class Demo02 {
    public static void main(String[] args) {
        Son3 son3 = new Son3();

        son3.test();
    }
}

