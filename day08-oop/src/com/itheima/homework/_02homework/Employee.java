package com.itheima.homework._02homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description Employee
 * @Author jeanAulis
 * @Date 2025-07-12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Employee {
    private String id;
    private String name;
    private double salary;

    public abstract void work();
    public abstract void eat();

}
