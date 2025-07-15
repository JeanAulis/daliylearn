package com.itheima._05Lambda;

/**
 * @Description Demo06
 * @Author jeanAulis
 * @Date 2025-07-15
 */
public class Demo06 {
    public static void main(String[] args) {
        SwimAble s1 = new Student();
        s1.swimming();

        SwimAble s2 = new SwimAble() {
            @Override
            public void swimming() {
                System.out.println("匿名1");
            }
        };
        s2.swimming();

        demo(new SwimAble() {
            @Override
            public void swimming() {
                System.out.println("匿名2");
            }
        });

        SwimAble s3 = ()-> {
                System.out.println("匿名3");
        };
        s3.swimming();

        SwimAble s4 = ()-> System.out.println("匿名4");
        s4.swimming();

        demo(() -> System.out.println("匿名5"));

    }

    public static void demo(SwimAble swimAble) {
        swimAble.swimming();
    }
}
