package com.itheima._05模版方法设计模式;

/**
 * @Description Singer
 * @Author jeanAulis
 * @Date 2025-07-12
 */
public abstract class Singer {

    public final void sing(){
        System.out.println("上台");
        System.out.println("打开话筒");
        singSong();
        System.out.println("关闭话筒");
        System.out.println("鞠躬");
    }

    public abstract void singSong();
}
