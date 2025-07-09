package com.itheima.movie;

import java.util.Arrays;

/**
 * @Description MovieOperator
 * @Author jeanAulis
 * @Date 2025-07-09
 */
public class MovieOperator {

    // 定义电影列表
    private static Movie[] movies = new Movie[5];

    /**
     * 显示全部电影信息
     */
    public static void showMovies(){

        //1.初始化电影数组的数据
        // 电影1：《流浪地球2》
        movies[0] = new Movie(
                1,                      // id
                "流浪地球2",             // name
                8.3,                    // score
                "郭帆",                  // director
                "https://picsum.photos/200/300?random=1", // poster
                125467,                 // wantWatchNumbers
                new String[]{"吴京", "李雪健", "沙溢", "宁理"} // acts
        );

        // 电影2：《满江红》
        movies[1] = new Movie(
                2,
                "满江红",
                7.8,
                "张艺谋",
                "https://picsum.photos/200/300?random=2",
                98765,
                new String[]{"沈腾", "易烊千玺", "张译", "雷佳音"}
        );

        // 电影3：《深海》
        movies[2] = new Movie(
                3,
                "深海",
                7.5,
                "田晓鹏",
                "https://picsum.photos/200/300?random=3",
                87654,
                new String[]{"苏鑫", "王亭文", "滕奎兴", "杨雨潼"}
        );

        // 电影4：《无名》
        movies[3] = new Movie(
                4,
                "无名",
                7.3,
                "程耳",
                "https://picsum.photos/200/300?random=4",
                76543,
                new String[]{"梁朝伟", "王一博", "周迅", "黄磊"}
        );

        // 电影5：《交换人生》
        movies[4] = new Movie(
                5,
                "交换人生",
                6.6,
                "苏伦",
                "https://picsum.photos/200/300?random=5",
                65432,
                new String[]{"雷佳音", "张小斐", "张宥浩", "沙溢"}
        );

        //2.遍历打印
        System.out.println("全部电影信息：");
        System.out.println("编号\t电影名称\t评分\t导演\t海报\t想看人数\t主演");
        for (int i = 0; i < movies.length; i++) {
            Movie movie = movies[i];
            System.out.printf("ID: %d | 片名: %s | 评分: %s | 导演: %s | 海报: %s | 想看人数: %s | 主演: %s%n",
                    movie.getId(),
                    movie.getName(),
                    movie.getScore(),
                    movie.getDirector(),
                    movie.getPoster(),
                    movie.getWantWatchNumbers(),
                    Arrays.toString(movie.getActs()));
        }
    }

    /**
     * 显示电影详情
     * @param id
     */
    public static void showMovieDetail(int id) {
        for (int i = 0; i < movies.length; i++) {

        }
    }
}
