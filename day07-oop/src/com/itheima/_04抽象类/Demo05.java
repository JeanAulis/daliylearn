package com.itheima._04抽象类;

/**
 * @Description 抽象类的注意事项，特点
 * @Author jeanAulis
 * @Date 2025-07-12
 */


/**
 * 抽象类的注意事项、特点
 *      抽象类中不一定要有抽象方法，有抽象方法的类必须是抽象类。
 */

//注意事项特点1：抽象类中不一定要有抽象方法，有抽象方法的类必须是抽象类。
abstract class Fu1{
    public void demo(){} //抽象类中不一定要有抽象方法
}
abstract class Fu2{
    public abstract void demo(); //有抽象方法的类必须是抽象类。

    //注意事项特点2：类有的成员：成员变量、方法、构造器，抽象类都可以有。
    private int age;
    public void demo2(){}
    public Fu2(){}
}

public class Demo05 {

    public static void main(String[] args) {
        //注意事项特点3：抽象类不能创建对象，仅作为一种特殊的父类，让子类继承并实现。
        // Fu1 fu1 = new Fu1(); 抽象类不可以实例，由于里面可能有抽象方法没有实现所以不能实例

    }
}
//注意事项特点4：一个类继承抽象类，必须重写完抽象类的全部抽象方法，否则这个类也必须定义成抽象类。
// class Son1 extends Fu2{} 报错，因为没有重写父类的抽象方法
abstract class Son1 extends Fu2{} //儿子也是抽象的就不用重写抽象方法，需要交给孙子去重写