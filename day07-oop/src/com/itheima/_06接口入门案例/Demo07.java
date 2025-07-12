package com.itheima._06接口入门案例;

/**
 * @Description Demo07
 * @Author jeanAulis
 * @Date 2025-07-12
 */
public class Demo07 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        eatAble(teacher);

        Student student = new Student();
        eatAble(student);
        studyAble(student);
    }

    public static void eatAble(Eat eat){
        eat.eat();
    }

    public static void studyAble(Study study){
        study.study();
    }
}
