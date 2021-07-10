package com.example.firstproject;

import androidx.lifecycle.ViewModel;

import java.util.HashMap;
import java.util.Map;

public class MovieViewModel extends ViewModel {

    private String movieTitle = "";
    private String movieDescription = "";
    private String movieReleaseYear = "";
    private String movieDirector = "";
    private String movieImageUrl = "";

    public void setMovie(String movieTitle, String movieDescription, String movieReleaseYear, String movieDirector, String movieImageUrl) {
        this.movieTitle = movieTitle;
        this.movieDescription = movieDescription;
        this.movieReleaseYear = movieReleaseYear;
        this.movieDirector = movieDirector;
        this.movieImageUrl = movieImageUrl;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public String getMovieReleaseYear() {
        return movieReleaseYear;
    }

    public void setMovieReleaseYear(String movieReleaseYear) {
        this.movieReleaseYear = movieReleaseYear;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public String getMovieImageUrl() {
        return movieImageUrl;
    }

    public void setMovieImageUrl(String movieImageUrl) {
        this.movieImageUrl = movieImageUrl;
    }
}
