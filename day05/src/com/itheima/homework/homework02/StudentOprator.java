package com.itheima.homework.homework02;

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

    public void show(){
        System.out.printf("姓名: %s, 年龄: %s %n",student.getName(), student.getAge());
    }

}
