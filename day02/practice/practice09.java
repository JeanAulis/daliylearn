package practice;

public class practice09 {
    public static void main(String[] args) {
//        第九题
//        李雷想买一个价值7988元的新手机，她的旧手机在二手市场能卖1500元，而手机专卖店推出以旧换新的优惠，把她的旧手机交给
//        店家，新手机就能够打8折优惠。为了更省钱，李雷要不要以旧换新？请在控制台输出。

        double money1 = 7988 - 1500;
        double money2 = 7088 * 0.8;
        if (money1 < money2) System.out.println("不需要以旧换新"); else System.out.println("要以旧换新");
        System.out.println("最少需要花费" + (money1 < money2 ? money1 : money2));
    }
}
