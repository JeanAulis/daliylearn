package com.itheima.homework._02homework;

/**
 * @Description Dog
 * @Author jeanAulis
 * @Date 2025-07-09
 */
public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String name, String color, double price) {
        super(name, color, price);
    }

    @Override
    public void skillAnimal(){
        System.out.println(this.getName() + "在看家");
    }
}
