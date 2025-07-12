package com.itheima._06接口入门案例;

/**
 * @Description Student
 * @Author jeanAulis
 * @Date 2025-07-12
 */
public class Student implements Eat, Study{


    /**
     * 重写吃的行为
     */
    @Override
    public void eat() {
        System.out.println("学生吃西餐");
    }

    /**
     * 重写学习的抽象行为
     */
    @Override
    public void study() {
        System.out.println("学习，学个屁哈哈哈哈哈哈");
    }
}
