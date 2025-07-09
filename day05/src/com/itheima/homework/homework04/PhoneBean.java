package com.itheima.homework.homework04;

/**
 * @Description PhoneBean
 * @Author jeanAulis
 * @Date 2025-07-08
 */
public class PhoneBean {
    private Phone phone;

    public PhoneBean(Phone phone){
        this.phone = phone;
    }

    public void call(){
        System.out.printf("正在使用价格为%d元%s的%s手机打电话\n",
                phone.getPrice(),
                phone.getColor(),
                phone.getBrand());
    }

    public void sendMessage(){
        System.out.printf("正在使用价格为%d元%s的%s手机发短信\n",
                phone.getPrice(),
                phone.getColor(),
                phone.getBrand());
    }
}
