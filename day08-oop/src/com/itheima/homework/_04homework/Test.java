package com.itheima.homework._04homework;

/**
 * @Description Test
 * @Author jeanAulis
 * @Date 2025-07-12
 */
public class Test {
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();

        d.eat();
        c.eat();

        if(d instanceof Dog){
            ((Dog) d).lookHome();
        }

        if(c instanceof Cat){
            ((Cat) c).catchMouse();
        }

    }
}
