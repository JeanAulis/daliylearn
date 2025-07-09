package com.itheima.movie;

import java.util.Scanner;

/**
 * @Description MovieTest
 * @Author jeanAulis
 * @Date 2025-07-09
 */
public class MovieTest {
    public static void main(String[] args) {
        MovieOperator.showMovies();

        Scanner sc = new Scanner(System.in);


        try {
            while (true){
                System.out.println("输入需要查询指定电影的编号，输入0退出：");
                int id = sc.nextInt();
                if (id == 0) {
                    System.out.println("已退出");
                    break;
                }
                MovieOperator.showMovieDetail(id);
            }
        } catch (Exception e) {
            System.err.println("请输入数字！");
            // throw new RuntimeException(e);
        }

    }
}
