package com.itheima.homework._06homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description Car
 * @Author jeanAulis
 * @Date 2025-07-12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String branch;
    private Orientation orientation;


    public void run(){
        System.out.println(branch + "正在向" + orientation + "行驶");
    }

    public static void main(String[] args) {
        Car car = new Car("问界M9", Orientation.EAST);
        car.run();
    }

}
