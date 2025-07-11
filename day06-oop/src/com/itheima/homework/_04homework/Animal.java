package com.itheima.homework._04homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description Animal
 * @Author jeanAulis
 * @Date 2025-07-11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Animal {
    private String name;
    private double weight;

    public void eat(){
        System.out.println("动物吃饭");
    }
}
