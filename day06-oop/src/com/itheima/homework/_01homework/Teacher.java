package com.itheima.homework._01homework;

import lombok.Data;

/**
 * @Description Teacher
 * @Author jeanAulis
 * @Date 2025-07-09
 */
@Data
public class Teacher extends Person {
    public Teacher(){

    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void skill(){
        System.out.println(this.getName() + "在上课");
    }
}
