package com.itheima.homework._02homework;

/**
 * @Description Cook
 * @Author jeanAulis
 * @Date 2025-07-12
 */
public class Cook extends Employee{
    public Cook(String id, String name, double salary) {
        super(id, name, salary);
    }

    public Cook() {
    }

    /**
     *
     */
    @Override
    public void work() {
        System.out.println("工号为：" + this.getId()
                + ",姓名为：" + this.getName()
                + "，工资为：" + this.getSalary()
                + "的厨师在炒菜");
    }

    /**
     *
     */
    @Override
    public void eat() {
        System.out.println("工号为：" + this.getId()
                + ",姓名为：" + this.getName()
                + "，工资为：" + this.getSalary()
                + "的厨师在吃肉");
    }
}
