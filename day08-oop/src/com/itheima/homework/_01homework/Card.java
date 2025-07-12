package com.itheima.homework._01homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description Card
 * @Author jeanAulis
 * @Date 2025-07-12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Card {
    private String id;
    private double balance;

    public abstract double pay(double originamount);
}
