package com.itheima.homework._01homework;

/**
 * @Description SilverCard
 * @Author jeanAulis
 * @Date 2025-07-12
 */
public class SilverCard extends Card{

    public SilverCard(String id, double balance) {
        super(id, balance);
    }

    public SilverCard() {
    }

    /**
     * @param originamount
     */
    @Override
    public double pay(double originamount){
        originamount *= 0.85;
        if(getBalance() > originamount){
            setBalance(getBalance() - originamount);
            System.out.printf("您是银卡会员，消费后余额为%.2f\n",getBalance());
        }else {
            System.out.println("余额不足！");
        }

        return originamount;
    }
}
