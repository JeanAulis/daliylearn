package com.itheima.homework._04homework;

/**
 * @Description Test
 * @Author jeanAulis
 * @Date 2025-07-11
 */
public class Test04 {
    public static void main(String[] args) {
        Animal dog = new Dog("小逼仔子", 23);
        dog.eat();

        if(dog instanceof Dog){
            ((Dog) dog).lookHome();
        }

        System.out.println("-----------------");

        Animal cat = new Cat("哈基米", 23);
        cat.eat();

        if (cat instanceof Cat) {
            ((Cat) cat).catchMouse();
        }
    }
}
