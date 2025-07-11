package com.itheima.homework._05homework;

/**
 * @Description Photo
 * @Author jeanAulis
 * @Date 2025-07-11
 */
public class Phone extends Digital{
    private String mode;

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Phone(String brand, double price, String mode) {
        super(brand, price);
        this.mode = mode;
    }

    public Phone() {
    }

    public void call(){
        System.out.println("使用了价格是" + getPrice() + "的" + mode + "的" + getBrand() + "手机打电话");
    }

    @Override
    public void takePhoto() {
        System.out.println("打开了美颜进行拍照");
    }
}
