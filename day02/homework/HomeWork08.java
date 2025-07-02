package homework;

import java.util.Scanner;
public class HomeWork08 {
    public static void main(String[] args){
        //    2.7 编程题目七
        //    需求：键盘录入学生考试成绩, 根据成绩程序给出不同的奖励。 需要考虑错误数据的情况.
        //      95~100分 : 自行车一辆
        //      90~94分 : 游乐场一次
        //      80~89分 : 变形金刚一个
        //      80分以下 : 挨顿揍, 这座城市又多了一个伤心的人~
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生考试成绩：");
        int score = sc.nextInt();
        if(score >= 95 && score <= 100){
            System.out.println("nb plus!奖励自行车一辆");
        }else if(score >= 90 && score <= 94){
            System.out.println("还不错～奖励游乐场一次");
        }else if(score >= 80 && score <= 89){
            System.out.println("一般般，鼓励一下，奖变形金刚一个");
        }else if (score < 80){
            System.out.println("回家吧孩子，挨顿揍, 这座城市又多一个伤心的人~");
        }else {
            System.out.println("你der啊，百分制，重新输入！");
        }

    }

}
