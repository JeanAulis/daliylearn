package com.itheima.homework._01homework;

import lombok.Data;

/**
 * @Description Coder
 * @Author jeanAulis
 * @Date 2025-07-09
 */
@Data
public class Coder extends Person {
    public Coder(){

    }
    public Coder(String name, int age) {
        super(name, age);
    }

    @Override
    public void skill() {
        System.out.println(this.getName() + "写代码");
    }
}
