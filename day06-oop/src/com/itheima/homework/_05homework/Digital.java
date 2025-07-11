package com.itheima.homework._05homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description Digital
 * @Author jeanAulis
 * @Date 2025-07-11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Digital {
    private String brand;
    private double price;

    public void takePhoto(){
        System.out.println("拍照");
    }
}
