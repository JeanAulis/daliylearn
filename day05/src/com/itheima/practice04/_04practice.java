package com.itheima.practice04;

/**
 * @Description _04practice
 * @Author jeanAulis
 * @Date 2025-07-08
 */
public class _04practice {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("播仔");
        s1.setChineseScore(-10);
        s1.setChineseScore(100);
        s1.setEnglishScore(-20);
        s1.setEnglishScore(99);
        s1.scoreAvg();
        s1.scoreAvg();

        Student s2 = new Student("播妞", -30, -40);
        Student s3 = new Student("播妞2", 99, 89);
        s2.scoreAvg();
        s3.scoreAvg();
    }
}
