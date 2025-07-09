package com.itheima.homework._02homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description Animal
 * @Author jeanAulis
 * @Date 2025-07-09
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Animal {
    private String name;
    private String color;
    private double price;

    public void eating(){
        System.out.println(this.getName() + "在吃饭");
    }
    public void sleeping(){
        System.out.println(this.getName() + "价格是" + this.getPrice() + "元");
    }

    public void skillAnimal(){
        System.out.println("小动物的技能");
    }
}
