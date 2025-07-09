package com.itheima.homework._02homework;

/**
 * @Description Test02
 * @Author jeanAulis
 * @Date 2025-07-09
 */
public class Test02 {
    public static void main(String[] args) {
        Dog dog = new Dog("小花", "白色", 1000);
        System.out.println(dog.getName() + " " + dog.getColor() + " " + dog.getPrice());
        dog.eating();
        dog.skillAnimal();
        System.out.println("----------------------------------------------------------------");
        Cat cat = new Cat("小花", "白色", 1000);
        System.out.println(cat.getName() + " " + cat.getColor() + " " + cat.getPrice());
        cat.eating();
        cat.skillAnimal();
    }
}
