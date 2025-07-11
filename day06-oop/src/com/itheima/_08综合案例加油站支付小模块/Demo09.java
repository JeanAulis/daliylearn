package com.itheima._08综合案例加油站支付小模块;

/**
 * @Description Demo09
 * @Author jeanAulis
 * @Date 2025-07-11
 */
public class Demo09 {
    public static void main(String[] args) {
        // 办理金卡/银卡
        GoldCard goldCard = new GoldCard("粤Axxxxx", "白马", "1234567890", 5000);
        if(goldCard.getMoney() < 5000){
            System.err.println("办理金卡失败，存入金额小于5000");
            return;
        }
        SilverCard silverCard = new SilverCard();
        silverCard.setCarNumber("粤Bxxxx");
        silverCard.setName("白羊");
        silverCard.setPhone("1234567890");
        silverCard.setMoney(5000);

       if (silverCard.getMoney() < 2000){
           System.err.println("办理银卡失败，存入金额小于2000");
           return;
       }

        // 刷卡消费
        swipingCard(goldCard, 2000);
        swipingCard(silverCard, 3000);
        //
    }

    /**
     * 模拟加油站ATM刷卡机
     * @param card 加油卡
     * @param money 消费金额
     */
    public static void swipingCard(Card card, double money){
            card.connsume(money);
    }
}
