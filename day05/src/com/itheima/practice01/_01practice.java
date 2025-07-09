package com.itheima.practice01;

/**
 * @Description _01practice
 * @Author jeanAulis
 * @Date 2025-07-08
 */
public class _01practice {

    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "小黑";
        s1.chineseScore = 132;
        s1.englishScore = 81;


        Student s2 = new Student();
        s2.name = "黑小";
        s2.chineseScore = 99;
        s2.englishScore = 146;


        s1.nameShow();
        System.out.print(" ");
        s1.scoreAvg();
        System.out.print(" ");
        s1.scoreTotal();
        System.out.println();
        s2.nameShow();
        System.out.printf(" ");
        s2.scoreAvg();
        System.out.print(" ");
        s2.scoreTotal();

    }
}
