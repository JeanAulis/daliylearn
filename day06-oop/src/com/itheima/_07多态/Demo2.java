package com.itheima._07多态;

/**
 * @Description Demo2
 * @Author jeanAulis
 * @Date 2025-07-11
 */
public class Demo2 {

    public static void main(String[] args) {

        demo(new Student());
        demo(new Teacher());

    }

    // public static void demo(Student student){
    //     student.run();
    //     System.out.println(student.name);
    // }
    //
    // public static void demo(Teacher teacher){
    //     teacher.run();
    //     System.out.println(teacher.name);
    // }

    public static  void demo(People people){
        people.run();
        // System.out.println(people.name);


        // jdk 16之前
        // if(people instanceof Teacher){
        //     Teacher teacher = (Teacher) people;
        //     System.out.println(teacher.name);
        // }else {
        //     Student student = (Student) people;
        //     System.out.println(student.name);
        // }

        // jdk16之后
        if(people instanceof Teacher teacher){
            System.out.println(teacher.name);
        }else if(people instanceof Student student){
            System.out.println(student.name);
        }
    }

}
