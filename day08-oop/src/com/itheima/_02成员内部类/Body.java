package com.itheima._02成员内部类;

/**
 目标：成员内部类，在类的成员变量位置再写一个完整类
 语法：  class A{
            class B{

            }
        }
 */
public class Body {
    //成员变量
    public double weight = 70; //单位公斤
    public boolean isLive = true; //是否存活


    //成员内部类
    class Heart{
        public double weight = 5; //单位公斤

        public void jump(){
            double weight = 1;
            System.out.println("局部重量："+ weight);//1
            System.out.println("内部类重量："+ this.weight);//5, this.变量名获取内部类成员变量
            System.out.println("外部类重量："+ Body.this.weight);//70, Body.this 代表外部类对象

            //判断是否存活,isLive取值顺序 就近原则： 局部变量 > 内部类成员变量 > 外部类对象成员变量
            if(isLive){
                System.out.println("心脏跳动正常");
            }else{
                System.out.println("心脏跳动异常");
            }
        }

    }
}