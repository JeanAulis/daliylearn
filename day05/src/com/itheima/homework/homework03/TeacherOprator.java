package com.itheima.homework.homework03;

/**
 * @Description TeacherOprator
 * @Author jeanAulis
 * @Date 2025-07-08
 */
public class TeacherOprator {

    private Teacher teacher;

    public TeacherOprator(Teacher teacher){
        this.teacher = teacher;
    }

    public void teach(){
        System.out.printf("工号为%s的%s老师正在讲课%n",
                teacher.getId(),
                teacher.getName());
    }
}
