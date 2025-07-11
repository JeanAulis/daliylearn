package com.itheima._08综合案例加油站支付小模块;

/**
 * @Description SilverCard
 * @Author jeanAulis
 * @Date 2025-07-11
 */
public class SilverCard extends Card{
    //
    // public SilverCard(String carNumber, String name, String phone, double money) {
    //     super(carNumber, name, phone, money);
    // }
    //
    // public SilverCard() {
    // }

    @Override
    public void connsume(double money){
        System.out.println("银卡正在消费(8折)");

        money = money * 0.9;
        if (this.getMoney() < money){
            System.err.println("余额不足");
        }

        this.setMoney(this.getMoney() - money);
        System.out.printf("消费成功，成功消费%.2f元，余额%.2f元！%n", money, this.getMoney());

    }
}
