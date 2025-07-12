package com.itheima._08综合案例吃饭打麻将开车;

/**
 * @Description Worker
 * @Author jeanAulis
 * @Date 2025-07-12
 */
public class Worker extends People implements DaMaJiangAble{
    /**
     *
     */
    @Override
    public void playMaJiang() {
        System.out.println("工人在打麻将");
    }

    /**
     *
     */
    @Override
    public void eat() {
        System.out.println("工人在吃东西");
    }
}
