package com.itheima.homework.homework01;

/**
 * @Description girlfriend
 * @Author jeanAulis
 * @Date 2025-07-08
 */
// @Data
// @NoArgsConstructor
// @AllArgsConstructor
public class Girlfriend {
    private String name;
    private double height;
    private double weight;

    public Girlfriend(){

    }

    public Girlfriend(String name, double height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
