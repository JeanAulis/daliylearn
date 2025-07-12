package com.itheima.homework._01homework;

/**
 * @Description GoldenCard
 * @Author jeanAulis
 * @Date 2025-07-12
 */
public class GoldenCard extends Card{

    public GoldenCard(String id, double balance) {
        super(id, balance);
    }

    public GoldenCard() {
    }

    @Override
    public double pay(double originamount){
        originamount *= 0.8;
        if(getBalance() > originamount){
            setBalance(getBalance() - originamount);
            System.out.printf("您是金卡会员，消费后余额为%.2f\n",getBalance());
        }else {
            System.out.println("余额不足！");
        }

        return originamount;
    }
}
