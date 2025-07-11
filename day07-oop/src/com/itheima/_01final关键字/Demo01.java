package com.itheima._01final关键字;

/**
 * @Description Demo01
 * @Author jeanAulis
 * @Date 2025-07-11
 */
public class Demo01 {
    String name;
    public static void main(String[] args) {
        System.out.println(DemoConstant.AUTHOR_NAME);
        final int age = 21;

        final Demo01 demo01 = new Demo01();
        demo01.name = "asd";
        demo01.name = "a3a";
        // Demo01 = new Demo01();
    }
}
final class Fu1{}

class Fu2{
    public final void demo(){}
}

class son1 extends Fu2{
    // @Override
    // public final void demo(){}
}
