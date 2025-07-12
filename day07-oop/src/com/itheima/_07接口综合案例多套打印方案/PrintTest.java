package com.itheima._07接口综合案例多套打印方案;

/**
 * @Description Test
 * @Author jeanAulis
 * @Date 2025-07-12
 */
public class PrintTest {
    public static void main(String[] args) {
        Student[] students = {
                new Student("a", Gender.Male, 89),
                new Student("b", Gender.Female, 99),
                new Student("c", Gender.Male, 79),
                new Student("d", Gender.Female, 69),
                new Student("e", Gender.Male, 77),
                new Student("f", Gender.Female, 97),
        };

        Case1AllPrint printAble1 = new Case1AllPrint();
        printMachine(printAble1, students);

        Case2GenderPrint printAble2 = new Case2GenderPrint();
        printMachine(printAble2, students);
    }

    public static void printMachine(PrintAble printAble, Student[] students){
        printAble.PrintStudents(students);
    }
}
