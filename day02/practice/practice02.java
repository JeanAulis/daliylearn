package practice;

public class practice02 {
    public static void main(String[] args) {
//        第二题
//        在java中，算术运算符加号“+”，也可以作为字符串的连接符。它可以将多个字符串连接在一
//        起，组成一个新的字符串，也可以将其他数据类型与字符串连接在一起，组成一个新的字符
//        串。请阅读如下解释：
//          /*
//              我们输出HelloWorld时，输出语句为：
//              System.out.println("HelloWorld");
//              其实，这个输出语句就是输出了一个字符串，这个字符串也可以由两个或者多个字符串组成。例如：
//              System.out.println("Hello" + "World");
//              这里，两个字符串会先拼接为一个，再输出，结果与上面一致。再比如：
//              int age = 20;
//              System.out.println("我的年龄是" + age);
//              上面输出语句中，将int类型的变量与字符串连接在一起，组成一个新的字符串，程序的输出结果是：
//              我的年龄是20
//              而且，还可以多个数据与字符串连接，例如：
//              int height = 180;
//              System.out.println("我的年龄是" + age + "，我的身高是" + height);
//              这个语句中，两个字符串与两个变量会拼成一个字符串输出，输出结果为：
//              我的年龄是20，我的身高是180
//          */
//        根据以上描述，请编写程序，定义两个整数（int类型）变量，并求这两个整数的和，将结果输
//        出到屏幕上。输出格式如下：
//        10 + 20 = 30
        int num1 = 10;
        int num2 = 20;

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

    }
}
