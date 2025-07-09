package com.itheima.homework._02homework;

/**
 * @Description Cat
 * @Author jeanAulis
 * @Date 2025-07-09
 */
public class Cat extends Animal {

    public Cat(String name, String color, double price) {
        super(name, color, price);
    }

    public Cat() {
    }

    @Override
    public void skillAnimal(){
        System.out.println(this.getName() + "抓老鼠");
    }
}
