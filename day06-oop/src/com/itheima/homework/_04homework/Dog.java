package com.itheima.homework._04homework;

/**
 * @Description Dog
 * @Author jeanAulis
 * @Date 2025-07-11
 */
public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void eat(){
        System.out.println(this.getName() + "吃骨头");
    }

    public void lookHome(){
        System.out.println(this.getName() + "老老实实看家");
    }
}
