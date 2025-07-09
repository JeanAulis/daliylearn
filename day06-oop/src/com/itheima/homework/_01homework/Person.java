package com.itheima.homework._01homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description People
 * @Author jeanAulis
 * @Date 2025-07-09
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private int age;

    public void eating(){
        System.out.println(this.getName() + "吃饭");
    }

    public void sleeping(){
        System.out.println(this.getName() + "睡觉");
    }

    public void skill(){
        System.out.println("工作");
    }
}
