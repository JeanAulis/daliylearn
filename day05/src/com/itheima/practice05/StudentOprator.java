package com.itheima.practice05;

/**
 * @Description StudentOprator
 * @Author jeanAulis
 * @Date 2025-07-08
 */
public class StudentOprator {

    private Student student;

    public StudentOprator(Student student){
        this.student = student;
    }


    public void nameShow(){
        System.out.printf("姓名：%s %n", student.getName());
    }

    public void scoreAvg(){
        System.out.printf("平均成绩为%.2f %n",  (double)(student.getChineseScore() + student.getEnglishScore()) / 2);
    }

    public void scoreTotal(){
        System.out.printf("总成绩为%.2f%n", student.getChineseScore() + student.getEnglishScore());
    }

    public void printThis(double chineseScore){
        if(student.getChineseScore() > chineseScore){
            System.out.printf("%s成绩合格了！%n", student.getName());
        }else {
            System.err.printf("%s成绩不合格%n", student.getName());
        }
    }
}
