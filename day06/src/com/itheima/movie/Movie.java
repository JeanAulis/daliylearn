package com.itheima.movie;

import lombok.Data;

/**
 * @Description movieBean
 * @Author jeanAulis
 * @Date 2025-07-09
 */
@Data
// @AllArgsConstructor
// @NoArgsConstructor
public class Movie {
    private int id;
    private String name;
    private double score;
    private String director;
    private String poster;
    private int wantWatchNumbers;
    private String[] acts;

    public Movie() {
    }

    public Movie(int id, String name, double score, String director, String poster, int wantWatchNumbers, String[] acts) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.director = director;
        this.poster = poster;
        this.wantWatchNumbers = wantWatchNumbers;
        this.acts = acts;
    }

}
