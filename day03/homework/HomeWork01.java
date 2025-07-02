package homework;

public class HomeWork01 {
    public static void main(String[] args) {
//        1 简答题
//        1.1 简答题一
//        请回答switch语句, () 中可以接收的类型有哪些 ?
//        答：byte, short, char, int, String


//        1.2 简答题二
//        如果switch语句省略了break, 会出现什么现象? 请简单描述下这个现象
//        答: case穿透现象，程序会继续往下执行，直到遇到break或者结束为止
//        switch (choice) {
//          case 1:
//              System.out.println("1");
//          case 2:
//              System.out.println("2");
//          case 3:
//              System.out.println("3");
//              break;
//          default:
//              break;
//        }
//        若选择1，2，3，程序会输出1，2，3，程序会继续往下执行，如果没有break，程序会继续执行下一个case或者default，直到遇到break或者结束


//        1.3 简答题三
//        键盘录入学生成绩, 0 ~ 100分, 根据成绩所在的区间, 打印出不同的奖励机制
//        对于这个需求, 你觉得应该使用 if , 还是 switch 呢 ? 请说明理由
//        答:使用if，因为switch语句不能处理区间，只能处理精确的值


//        1.4 简答题四
//        简单描述下 Java 中循环的作用, 还有我们为什么要学习循环 ?
//        答:对于需要重复执行的代码，循环能解决重复的问题，提高工作效率，避免重复写代码


//        1.5 简答题五
//        现有如下代码 , 请说出执行流程和最终结果
//        public class Demo {
//            public static void main(String[] args){
//                int i;
//                for(i = 1; i <= 5; i++){
//                    System.out.println(i);
//                }
//                System.out.println(i);
//             }
//        }
//        答： 从1～5遍历输出，输出1，2，3，4，5，6。
//        i需要在for外声明类型，否则无法在循环外访问。
//        当循环到i=5边界时，符合条件，还会继续执行，输出5后i自增，跳出循环输出6。


//        1.6 简答题六
//        现有如下代码 , 请说出执行流程和最终结果
//        public class Demo {
//            public static void main(String[] args) {
//                int sum = 0;
//                for (int i = 1; i <= 5; i++) {
//                    sum += i;
//                    System.out.print(sum + " ");
//                }
//            }
//        }
//        答:输出为1 3 6 10 15
//        第一次循环时i = 1, sum = 0, 输出为1
//        第二次循环时i = 2, sum = 1, 输出为3
//        第三次循环时i = 3, sum = 3, 输出为6
//        第四次循环时i = 4, sum = 6, 输出为10
//        第五次循环时i = 5, sum = 10, 输出为15


//        1.7 简答题七
//        现有如下代码 , 统计 1 ~ 20 之间, 5的倍数有几个, 但是代码存在错误, 请说明错误原因, 并更正代码
//        public class Demo {
//            public static void main(String[] args) {
//                for (int i = 1; i <= 20; i++) {
//                    int count = 0;
//                    if(i % 5 == 0){
//                        count++;
//                    }
//                    System.out.println(count);
//                }
//            }
//        }
//        答:count定义在了循环内部，导致每次循环都会将count的值重置为0，导致无法计数。另外，count的输出一个移出循环，减少输出冗余数据。修改如下
//          int count = 0;
//          for (int i = 1; i <= 20; i++) {
//              if(i % 5 == 0){
//                  count++;
//              }
//          }
//          System.out.println(count);


//        1.8 简答题八
//        现有如下代码 , 打印所有的水仙花数, 但是代码存在错误, 请说明错误原因, 并更正代码
//        public class Demo {
//            public static void main(String[] args) {
//                int i = 100;
//                while(i <= 999){
//                    int ge = i % 10;
//                    int shi = i / 10 % 10;
//                    int bai = i / 10 / 10 % 10;
//                    if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i){
//                        System.out.println(i);
//                    }
//                    i++;
//                }
//            }
//        }
//        答: 没有自增，将会死循环执行检查100是否是水仙花输，100不是，所以不会有任何输出，但程序会进行死循环,添加i++即可


//        1.9 简答题九
//        请说出 Java 的三种循环分别是什么 ? 以及各自的区别
//        答: while, do while, for
//        各自的区别：while循环先判断条件，满足条件才执行循环体；
//        do while循环先执行循环体，再判断条件，满足条件才继续执行循环体；
//        for循环先定义变量，再判断条件，满足条件才执行


//        1.10 简答题十
//        观察以下的代码 , 下划线位置加入什么语句,可以在控制台打印
//        7次 I Love Java
//        2次 I Love Java
//        13次 I Love Java
//        public class Demo {
//            public static void main(String[] args) {
//                for (int i = 1; i <= 10; i++) {
//                    if (i % 3 == 0) {
//                      //___________
//                    }
//                    System.out.println("I Love Java");
//                }
//            }
//        }
//        答:
//        7次: continue;
//        2次: break;
//        13次: System.out.println("I Love Java");


    }
}
