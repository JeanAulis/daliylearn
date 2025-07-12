package com.itheima._07接口综合案例多套打印方案;

/**
 * @Description PrintAble
 * @Author jeanAulis
 * @Date 2025-07-12
 */
public interface PrintAble {

    void PrintStudents(Student[] students);

    // jdk8后新增方法
    default void test1(){
        System.out.println("默认行为方法");
        test2();
    }

    private void test2(){
        System.out.println("私有方法");
        test3();
    }

    private void test3(){
        System.out.println("静态方法");
        test1();
    }

}
