package com.trantien.demo_rx.models;

public class Movie {
    String name;
    String type;
    String time;
    Double rate;

    public Movie(String name, String type, String time, Double rate) {
        this.name = name;
        this.type = type;
        this.time = time;
        this.rate = rate;
    }

    public Movie() {
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", time='" + time + '\'' +
                ", rate=" + rate +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
}
