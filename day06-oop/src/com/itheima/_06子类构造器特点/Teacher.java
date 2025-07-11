package com.itheima._06子类构造器特点;

/**
 * @Description Teacher
 * @Author jeanAulis
 * @Date 2025-07-11
 */
public class Teacher extends People{
    private String skill;

    public Teacher(){
        System.out.println("执行子类Teacher无参构造器");
    }

    public Teacher(String skill) {
        super("黑马",19);
        System.out.println("执行子类Teacher有参构造器");
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "skill='" + skill + '\'' +
                "name='" + getName() + '\'' +
                "age='" + getAge() + '\'' +
                '}';
    }
}
