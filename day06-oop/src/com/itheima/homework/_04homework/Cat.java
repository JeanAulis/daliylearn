package com.itheima.homework._04homework;

/**
 * @Description Cat
 * @Author jeanAulis
 * @Date 2025-07-11
 */
public class Cat extends Animal{
    public Cat(String name, double weight) {
        super(name, weight);
    }

    public Cat() {
    }

    @Override
    public void eat(){
        System.out.println(this.getName() + "吃鱼");
    }


    public void catchMouse(){
        System.out.println(this.getName() + "努力抓老鼠");
    }
}
