package com.itheima._04继承的特点;

/**
 * @Description Demo01
 * @Author jeanAulis
 * @Date 2025-07-09
 */

class Fu1 {}
class Fu2 {}

class Son1 extends Fu1 {}
class Sun1 extends Son1 {}

class Demo{}
class Demo2 extends Object{}
class Demo3 extends Fu2{}



public class Demo01 {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.hashCode();

        Demo2 demo2 = new Demo2();
        demo2.hashCode();

        Demo3 demo3 = new Demo3();
        demo3.hashCode();
    }
}
