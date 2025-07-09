package com.itheima.practice05;

/**
 * @Description _05practice
 * @Author jeanAulis
 * @Date 2025-07-08
 */
public class _05practice {
    public static void main(String[] args) {
        Student bee = new Student("bee", 88, 35);

        StudentOprator so = new StudentOprator(bee);

        so.nameShow();
        so.scoreAvg();
        so.scoreTotal();
    }
}
