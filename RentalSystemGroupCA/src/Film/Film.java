/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Film;

import java.time.Duration;

/**
 *
 * @author diego
 */
public class Film {
    private int id;
    private String title;
    private int year;
    private String director;
    private Duration duration; // specific type to be used for decribe a length of time
    private String parental;
    private String genre;

    // IDE generated Constructors
    public Film(int id, String title, int year, String director, Duration duration, String parental, String genre) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.director = director;
        this.duration = duration;
        this.parental = parental;
        this.genre = genre;
    }

}