package com.itheima._04匿名内部类;

/**
 * @Description Demo04
 * @Author jeanAulis
 * @Date 2025-07-15
 */
public class Demo04 {
    public static void main(String[] args) {
        SwimAble s1 = new Student();
        s1.swimming();

        SwimAble s2 = new SwimAble() {
            @Override
            public void swimming() {
                System.out.println("匿名");
            }
        };
        s2.swimming();

        demo(new SwimAble() {
           @Override
           public void swimming(){
               System.out.println("匿名2");
           }
        });

        }
        public static void demo(SwimAble swimAble){
            swimAble.swimming();
    }
}
