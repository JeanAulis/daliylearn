package com.itheima.homework._05homework;

/**
 * @Description Compute
 * @Author jeanAulis
 * @Date 2025-07-11
 */
public class Compute extends Digital{
    private int cpu;
    public Compute(String brand, double price, int cpu) {
        super(brand, price);
        this.cpu = cpu;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public Compute() {
    }
    public void codeing(){
        System.out.println("使用了价格是" + getPrice() + "的" + cpu + "核的" + getBrand() + "电脑进行编程");
    }
    @Override
    public void takePhoto() {
        System.out.println("简单拍照");
    }
}
