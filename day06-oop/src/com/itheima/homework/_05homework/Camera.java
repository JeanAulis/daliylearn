package com.itheima.homework._05homework;

/**
 * @Description Camera
 * @Author jeanAulis
 * @Date 2025-07-11
 */
public class Camera extends Digital{
    private String type;

    public Camera(String brand, double price, String type) {
        super(brand, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Camera() {
    }

    public void video() {
        System.out.println("使用了价格是" + getPrice() + "的" + getBrand() + "相机录像");
    }

    @Override
    public void takePhoto() {
        System.out.println("使用人像模式进行拍照");
    }
}
