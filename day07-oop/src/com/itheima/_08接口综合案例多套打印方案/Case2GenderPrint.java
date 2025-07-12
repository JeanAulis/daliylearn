package com.itheima._08接口综合案例多套打印方案;

/**
 * @Description Case2GenderPrint
 * @Author jeanAulis
 * @Date 2025-07-12
 */
public class Case2GenderPrint implements PrintAble{

    /**
     * @param students
     */
    @Override
    public void PrintStudents(Student[] students) {
        System.out.println("按照性别打印：");
        System.out.println("男同学有：");
        for (Student student : students) {
            if(student.getGender() == Gender.Male){
                System.out.println(student);
            }
        }
        System.out.println("女同学有：");
        for (Student student : students) {
            if(student.getGender() == Gender.Female){
                System.out.println(student);
            }
        }
    }
}
