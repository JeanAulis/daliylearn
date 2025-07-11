package com.itheima._08综合案例加油站支付小模块;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description Card
 * @Author jeanAulis
 * @Date 2025-07-11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    private String carNumber; // 车牌号
    private String name; // 姓名
    private String phone; // 手机号
    private double money; // 余额


    public void connsume(double money){
        if(this.money>money){
            this.money = this.money-money;
            System.out.printf("消费成功，成功消费%f金额，余额%f金额!%n",money,this.money);
        }else{
            System.err.println("消费失败，余额不足！");
        }
    }
}
