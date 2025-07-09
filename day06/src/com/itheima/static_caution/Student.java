package com.itheima.static_caution;

/**
 * @Description Student
 * @Author jeanAulis
 * @Date 2025-07-09
 */
public class Student {
    //实例变量
    String name;

    //实例方法
    public void print(){}

    //静态变量
    static int count;

    //静态方法
    public static void printStatic(){}


    //注意1：静态方法中可以直接访问静态成员，不可以直接访问实例成员。
    public static void printStatic2(){
        //静态方法中可以直接访问静态成员
        count++;
        printStatic();

        //不可以直接访问实例成员
        // name="xxx";
        // print();

        //解决方案：调用实例成员
        Student s1 = new Student();
        s1.name = "abc";
        s1.print();

        //注意3：实例方法中可以出现this关键字，静态方法中不可以出现this关键字的。
        //静态方法中不可以出现this关键字的
        //System.out.println(this); 报错，找不到对象
    }

    //注意2：实例方法中既可以直接访问静态成员，也可以直接访问实例成员。
    public void print2(){
        // 实例方法中既可以直接访问静态成员
        count++;
        printStatic();

        // 也可以直接访问实例成员
        name="xxx";//可以找到所属对象，就是当前当前方法的对象
        print();

        //注意3：实例方法中可以出现this关键字，静态方法中不可以出现this关键字的。
        //实例方法中可以出现this关键字
        System.out.println(this);//调用当前方法的对象就是this

    }
}
