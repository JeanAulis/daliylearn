package practice;

public class practice01 {
    public static void main(String[] args) {
//        day02 - Java基础语法练习
//        第一题
//        练习基本数据类型之间的相互转换。
//        定义int类型变量，将其赋值给double类型，查看结果。
//        定义byte类型变量，将其赋值给short类型，查看结果。
//        定义byte类型变量，将其赋值给int类型，查看结果。
//        定义double类型变量，将其赋值给int类型，查看结果。

        int a = 10;
        double b = a;

        byte c = 10;
        short d = c;

        byte e = 10;
        int f = e;

        double g = 10.0;
        int h = (int)g;
        // 从double转换到int可能会有损失

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
