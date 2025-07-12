package com.itheima.homework._03homework;

/**
 * @Description Square
 * @Author jeanAulis
 * @Date 2025-07-12
 */
public class Square extends Shape{
    double size;

    public Square(){}

    public Square(double size) {
        this.size = size;
    }

    /**
     * @param size
     * @return
     */
    @Override
    public double area(double size) {
        double area = size * size;
        return area;
    }

    /**
     * @param size
     * @return
     */
    @Override
    public double perimeter(double size) {
        double perimeter = size * 4;
        return perimeter;
    }
}
