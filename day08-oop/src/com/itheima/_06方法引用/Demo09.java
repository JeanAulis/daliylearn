package com.itheima._06方法引用;

/**
 * 工厂设计模式：用于创建对象。工厂设计模型：就是用于创建对象。
 * 当一个对象的创建比较简单直接new 类构造器()就可以了，但是如果创建对象比较复杂就需要实用工程来创建
 */
@FunctionalInterface
interface StudentFactory{
    Student create(); // 没有参数
}

@FunctionalInterface
interface StudentFactory2{
    Student create(String name, int age, double score); // 有参数
}

public class Demo09 {
    public static void main(String[] args) {
        //目标：构造器类型方法引用代替lambda表达式
        //语法：类名::new
        //要求：代替的是lambda表达式方法体里面只有创建对象，
        //        lambda表达式的参数要与引用的构造器方法的参数要一致

        // 匿名内部类方式
        StudentFactory sf1 = new StudentFactory() {
            @Override
            public Student create() {
                return new Student();
            }
        };
        Student s1 = sf1.create();
        StudentFactory2 sf2 = new StudentFactory2() {
            @Override
            public Student create(String name, int age, double score) {
                return new Student(name, age, score);
            }
        };
        new Student("op", 91, 0);

        // lambda方式
        StudentFactory sf3 = () -> new Student();
        Student s3 = sf3.create();
        StudentFactory2 sf4 = (name, age, score) -> new Student(name, age, score);
        Student s4 = sf4.create("po", 88, 90);

        // 构造器引用
        StudentFactory sf5 = Student::new;
        Student s5 = sf5.create();
        StudentFactory2 sf6 = Student::new;
        Student s6 = sf6.create("yh", 98, 1);
    }

}
