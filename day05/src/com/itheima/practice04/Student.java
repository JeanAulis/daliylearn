package com.itheima.practice04;

/**
 * @Description Student
 * @Author jeanAulis
 * @Date 2025-07-08
 */
public class Student {
    private String name;
    private double chineseScore;
    private double englishScore;


    public void setName(String name) {
        this.name = name;
    }

    public void setChineseScore(double chineseScore) {
        if (chineseScore < 0 || chineseScore > 150) {
            System.err.printf("给 %s 设置的语文分数不合法！%n" ,name);
        }else {
            this.chineseScore = chineseScore;
            System.out.printf("%s 的语文分数为；%.1f %n",name , chineseScore);
        }
    }

    public void setEnglishScore(double englishScore) {
        if (englishScore < 0 || englishScore > 150) {
            System.err.printf("给 %s 设置的英语分数不合法！%n" ,name);
        }else{
            this.englishScore = englishScore;
            System.out.printf("%s 的英语分数为；%.1f %n",name , englishScore);
        }
    }
    public String getName() {
        return name;
    }

    public double getChineseScore() {
        return chineseScore;
    }


    public double getEnglishScore() {
        return englishScore;
    }

    public Student(){
        System.out.println("使用无参构造器");
    }

    public Student(String name, double chineseScore, double englishScore){
        System.out.println("使用有参构造器");
        // this.name = name;
        // this.chineseScore = chineseScore;
        // this.englishScore = englishScore;

        setName(name);
        setChineseScore(chineseScore);
        setEnglishScore(englishScore);
    }


    public void nameShow(){
        System.out.printf(name);
    }

    public void scoreAvg(){
        System.out.printf("%.2f %n",  (double)(chineseScore + englishScore) / 2);
    }

    public void scoreTotal(){
        System.out.printf("%.2f", chineseScore + englishScore);
    }

    public void printThis(double chineseScore){
        if(this.chineseScore > chineseScore){
            System.out.printf("%s成绩合格了！%n", name);
        }else {
            System.err.printf("%s成绩不合格%n", name);
        }
    }

}
