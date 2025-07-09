package com.itheima.practice03;

/**
 * @Description Student
 * @Author jeanAulis
 * @Date 2025-07-08
 */
public class Student {
    String name;
    double chineseScore;
    double englishScore;


    public Student(){
        System.out.println("使用无参构造器");
    }

    public Student(String name, double chineseScore,double englishScore){
        System.out.println("使用有参构造器");
        this.name = name;
        this.chineseScore = chineseScore;
        this.englishScore = englishScore;
    }


    public void nameShow(){
        System.out.printf(name);
    }

    public void scoreAvg(){
        System.out.printf("%.2f",  (double)(chineseScore + englishScore) / 2);
    }

    public void scoreTotal(){
        System.out.printf("%.2f", chineseScore + englishScore);
    }

    public void printThis(double chineseScore){
        if(this.chineseScore > chineseScore){
            System.out.printf("%s成绩合格了！%n", name);
        }else {
            System.err.printf("%s成绩不合格%n", name);
        }
    }
}
