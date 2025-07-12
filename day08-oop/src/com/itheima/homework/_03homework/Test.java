package com.itheima.homework._03homework;

import java.util.Scanner;

/**
 * @Description Test
 * @Author jeanAulis
 * @Date 2025-07-12
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入圆的半径：");
        double size_circle = scanner.nextInt();
        Circle circle = new Circle();
        System.out.println("圆面积：" + circle.area(size_circle));
        System.out.println("圆周长：" + circle.perimeter(size_circle));

        System.out.println("请输入正方形的边长：");
        double size_square = scanner.nextInt();
        Square square = new Square();
        System.out.println("正方形面积：" + square.area(size_square));
        System.out.println("正方形周长：" + square.perimeter(size_square));

    }
}
