package homework;

public class HomeWork05 {
    public static void main(String[] args) {
//        2.4 编程题目四
//        需求描述： 1.打印1到100之内的整数，但数字中包含9的要跳过 9 19 91 92 个位是9或者十位是
//        9的数要跳过 2.每行输出5个满足条件的数，之间用空格分隔 3.如：1 2 3 4 5 6 7 8 10 11 12 13
//        14 15 16
        int count = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 10 == 9 || i / 10 == 9){
                System.out.print(i + " ");
                count++;
                if (count % 5 == 0){
                    System.out.println();
                }
            }
        }
    }
}
