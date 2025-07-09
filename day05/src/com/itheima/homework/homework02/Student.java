package com.itheima.homework.homework02;

/**
 * @Description Student
 * @Author jeanAulis
 * @Date 2025-07-08
 */
// @Data
// @NoArgsConstructor
// @AllArgsConstructor
public class Student {
    private String name;
    private int age;

    public Student(){

    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
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
