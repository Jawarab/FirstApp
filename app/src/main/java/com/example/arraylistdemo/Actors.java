package com.example.arraylistdemo;


class Actors {

    private String name;
    private String movie;

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public Actors(String name, String movie) {
        this.name = name;
        this.movie = movie;
    }
}



