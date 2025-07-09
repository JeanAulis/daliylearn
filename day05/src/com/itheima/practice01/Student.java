package com.itheima.practice01;

/**
 * @Description Student
 * @Author jeanAulis
 * @Date 2025-07-08
 */
public class Student {
     String name;
    double chineseScore;
    double englishScore;


    public void nameShow(){
        System.out.printf(name);
    }

    public void scoreAvg(){
        System.out.printf("%.2f",  (double)(chineseScore + englishScore) / 2);
    }

    public void scoreTotal(){
        System.out.printf("%.2f", chineseScore + englishScore);
    }
}
