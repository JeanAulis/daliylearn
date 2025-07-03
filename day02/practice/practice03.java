package practice;

public class practice03 {
    public static void main(String[] args) {
        //        第三题
//        在今天的课程学习中，我们知道了java的8种基本数据类型，随着后续学习，我们还将学习引用
//        数据类型。此时由于练习需要，我们要了解其中一个最常用的引用数据类型-字符串（String），字符串变量的一种定义方式与基本数据类型一致：
//          // 数据类型 变量名 = 初始化值；
//        String str = "中国";
//        System.out.println(str); // 其中String为数据类型，str为变量名（符合标识符规则即可），
//          // 总体即表示：将字符串"abc"，赋值给字符串类型的变量str。
//          // 输出结果为：中国
//        "中国"是我们学习的字符串常量值。
//        请根据以上描述，选用合适的数据类型定义变量用于描述一个学员的信息，并将其输出到屏幕
//        上。输出结果如下：
//          ************************
//          我的姓名是：张三
//          我的性别是：男
//          我的年龄是：18
//          我的地址是：xx省xx市
//          我的饭卡余额是：55.55元
//          ************************
        System.out.println("************************");
        String name = "张三";
        System.out.println("我的姓名是：" + name);
        String sex = "男";
        System.out.println("我的性别是：" + sex);
        int age = 18;
        System.out.println("我的年龄是：" + age);
        String address = "东北省吉林市";
        System.out.println("我的地址是：" + address);
        double money = 55.55;
        System.out.println("我的饭卡余额是：" + money + "元");
        System.out.println("************************");

    }
}
