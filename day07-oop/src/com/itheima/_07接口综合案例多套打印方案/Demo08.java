package com.itheima._07接口综合案例多套打印方案;

/**
 * @Description Demo7
 * @Author jeanAulis
 * @Date 2025-07-12
 */

interface A{
    void printA();
}
interface B extends A{
    void printB();
}

interface C extends A,B{
    void printC();
} // 可以不写A，直接继承，这里是是演示可多继承

public class Demo08 implements C{
    /**
     *
     */
    @Override
    public void printC() {

    }

    /**
     *
     */
    @Override
    public void printB() {

    }

    /**
     *
     */
    @Override
    public void printA() {

    }
}
