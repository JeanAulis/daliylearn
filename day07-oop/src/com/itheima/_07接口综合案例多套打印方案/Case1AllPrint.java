package com.itheima._07接口综合案例多套打印方案;

/**
 * @Description Case1AllPrint
 * @Author jeanAulis
 * @Date 2025-07-12
 */
public class Case1AllPrint implements PrintAble {

    @Override
    public void PrintStudents(Student[] students){
        System.out.println("打印全部学生");
        for(Student student : students){
            System.out.println(student);
        }
    }
}
