package com.itheima.practice05;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description Student
 * @Author jeanAulis
 * @Date 2025-07-08
 */
@Data
@NoArgsConstructor //生成无参构造器
// @AllArgsConstructor //生成全参构造器，暂时不用，为默认生成的没有调用封装的set方法设置数据，默认this
public class Student {
    private String name;
    private double chineseScore;
    private double englishScore;

    public Student(String name, double chineseScore, double englishScore){
        setName(name);
        setChineseScore(chineseScore);
        setEnglishScore(englishScore);
    }


    public void setChineseScore(double chineseScore) {
        if (chineseScore < 0 || chineseScore > 150) {
            System.err.printf("给 %s 设置的语文分数不合法！%n" ,name);
        }else {
            this.chineseScore = chineseScore;
        }
    }

    public void setEnglishScore(double englishScore) {
        if (englishScore < 0 || englishScore > 150) {
            System.err.printf("给 %s 设置的英语分数不合法！%n" ,name);
        }else{
            this.englishScore = englishScore;
        }
    }
}
