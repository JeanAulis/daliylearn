package com.itheima.homework._03homework;

/**
 * @Description Circle
 * @Author jeanAulis
 * @Date 2025-07-12
 */
public class Circle extends Shape{
    double size;

    public Circle(double size) {
        this.size = size;
    }

    public Circle() {
    }

    /**
     * @param size
     * @return
     */
    @Override
    public double area(double size) {

        double area = Math.PI * size * size;
        return area;
    }

    /**
     * @param size
     * @return
     */
    @Override
    public double perimeter(double size) {
        double perimeter = 2 * Math.PI * size;
        return perimeter;
    }
}
