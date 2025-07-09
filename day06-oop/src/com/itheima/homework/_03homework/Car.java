package com.itheima.homework._03homework;

/**
 * @Description Car
 * @Author jeanAulis
 * @Date 2025-07-09
 */
public class Car {
    private String brand; //品牌名
    private double price;

    public Car() {
    }

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "Car[" + brand + "," + price + "]";
    }
}
