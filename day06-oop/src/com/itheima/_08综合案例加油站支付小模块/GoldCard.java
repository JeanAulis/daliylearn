package com.itheima._08综合案例加油站支付小模块;

import lombok.Data;

/**
 * @Description GoldCard
 * @Author jeanAulis
 * @Date 2025-07-11
 */
@Data
public class GoldCard extends Card{

    public GoldCard(){}

    public GoldCard(String carNumber, String name, String phone, double money) {
        super(carNumber, name, phone, money);
    }

    /**
     * 金卡消费行为
     * @Param money 消费金额
     */
    @Override
    public void connsume(double money){
        System.out.println("金卡正在消费(9折)");
        money = money * 0.8;

        if (this.getMoney() < money){
            System.err.println("余额不足");
        }

        this.setMoney(this.getMoney() - money);
        System.out.printf("消费成功，成功消费%.2f元，余额%.2f元！%n", money, this.getMoney());

        if(money>=200){
            System.out.println("符合消费超过200元，打印免费洗车票服务");
        }
    }
}
