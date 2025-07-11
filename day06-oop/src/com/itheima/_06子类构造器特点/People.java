package com.itheima._06子类构造器特点;

/**
 * @Description People
 * @Author jeanAulis
 * @Date 2025-07-11
 */
public class People {
    private String name;
    private int age;
    private double score;

    public People() {
        System.out.println("使用父类无参构造器");
    }

    public People(String name){
        this.name = name;
    }
    public People(String name, int age) {
        // this.name = name;
        this(name);
        this.age = age;

        System.out.println("使用父类有参构造器");
    }

    public People(String name, int age, double score){
        // this.name = name;
        // this.age = age;
        this(name,age);
        this.score = score;
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
