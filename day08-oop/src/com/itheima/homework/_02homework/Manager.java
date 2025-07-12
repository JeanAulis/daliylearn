package com.itheima.homework._02homework;

/**
 * @Description Manager
 * @Author jeanAulis
 * @Date 2025-07-12
 */
public class Manager extends Employee{
    public Manager(String id, String name, double salary) {
        super(id, name, salary);
    }

    public Manager() {
    }

    /**
     *
     */
    @Override
    public void work() {
        System.out.println("工号为：" + this.getId()
                + ",姓名为：" + this.getName()
                + "，工资为：" + this.getSalary()
                + "的经理在工作:管理其他人");
    }

    /**
     *
     */
    @Override
    public void eat() {
        System.out.println("工号为：" + this.getId()
                + ",姓名为：" + this.getName()
                + "，工资为：" + this.getSalary()
                + "的经理在吃鱼");
    }
}
