package homework;

public class HomeWork01 {
    public static void main(String[] args) {

//        1	简答题
//        1.1 简答题一
//        请观察下列代码是否存在问题, 如果有, 请说明原因并改成
//        byte b1 = 3; // 第一行
//        byte b2 = 4; // 第二行
//        byte b3 = b1 + b2; // 第三行
//        byte b = 3 + 4; // 第四行

//        答: byte类型不能进行运算, 需要进行类型转换
//        byte b1 = 3;
//        byte b2 = 4;
//        byte b3 = (byte)(b1 + b2); // 修改后的
//        byte b = 3 + 4;

//        1.2简答题二
//        现有代码如下，请回答打印的结果，并描述中间的运算过程
//        int num = 10;
//        char content = 'a';
//        int result = num + content;
//        System.out.println(result);
//        答：结果result为107
//        a 对应码表为97，10 对应码表为10，所以结果为97+10=107

//        1.3 简答题三
//        简述下 ++ 运算符在参与运算使用的时候, 在前在后的区别
//        答： 独立操作时，前后并无区别
//        参与运算时，++在左侧时，先加再赋值
//        ++在右侧时，先赋值再加

//        1.4简答题四
//        现有代码如下，请回答打印的结果，并描述中间的运算过程
//        int a = 10;
//        int b = ++a;
//        int c = a++;
//        int result = b++ + ++c;
//        答：自上而下：a = 10, b = 11, c = 10, a = 11

//        1.5 简答题五
//        描述下算数运算符中 , / 和 % 的特点
//        答：/ 为整除，如834 / 100 = 8，% 为取余数，如834 % 100 = 34

//        1.6 简答题六
//        现有代码如下, 想要运算结果是2.5 代码应该怎么改 ?
//        int a = 5;
//        int b = 2;
//        double c = a / b;
//        System.out.println(c);
//        答：以下三种均能输出2.5
//        System.out.println("2.5");
//        double c = (double)a / b;
//        double c = a / (double)b;

//        1.7 简答题七
//        现有代码如下, 请回答打印的结果, 并描述中间的运算过程
//        int a = 10;
//        double b = 12.3;
//        a += b;
//        System.out.println(a);
//        答：a += b; 等价于 a = a + b; a = 22(类型转换为int)

//        1.8 简答题八
//        现有代码如下, 请回答打印的结果, 并描述中间的运算过程
//        public static void main(String[] args) {
//            int x = 3;
//            int y = 4;
//            boolean result = x++ > 3 && --y < 4;
//            System.out.println(result);
//            System.out.println(x);
//            System.out.println(y);
//        }
//        答: (务必说明原因)
//        boolean result = x++ > 3 && --y < 4; //这里等价于 boolean result = 3 > 3 && 3 < 4;
//        运行之后result为false, x = 4, y = 3

//        1.9 简答题八
//        请结合下列代码, 描述 if 语句执行流程
//        if(判断条件1){
//            语句体1;
//        }else if(判断条件2){
//            语句体2;
//        }else if(判断条件3){
//            语句体3;
//        }else{
//            语句体n+1;
//        }
//        答：首先判断第一个条件，若符合，则进入第一个:语句体1，不执行其他的代码；
//        若不符合第一个条件，但符合第二个条件，则进入第二个:语句体2,不执行其他的代码；
//        若不符合第一个条件，不符合第二个条件，但符合第三个条件，则进入第三个:语句体3,不执行其他的代码；
//        若不符合第一个条件，不符合第二个条件，也不符合第三个条件，则进入最后一个:语句体n+1,不执行其他的代码；
    }

}