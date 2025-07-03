package practice;

public class practice07 {
    public static void main(String[] args) {
//        第七题
//        红茶妹妹有21元钱，她攒了几天钱之后自己的钱比原来的两倍还多三块。绿茶妹妹有24元钱，她攒了几天钱之后自己的钱正好是
//        原来的两倍。那么红茶和绿茶现在的钱一样多，请问对么？请编写程序进行判断。

        int money_red = 21;
        int money_green = 24;
        int money_red_new = money_red * 2 + 3;
        int money_green_new = money_green * 2;
        if(money_red_new == money_green_new){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
