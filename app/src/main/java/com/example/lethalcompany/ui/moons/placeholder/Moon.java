package com.example.lethalcompany.ui.moons.placeholder;

import java.io.Serializable;

public class Moon implements Serializable {

    private Long id;
    private double cost;
    private String defaultLayout;
    private String difficulty;
    private int maxScrap;
    private int minScrap;
    private String name;
    private String risk;
    private String weather;

    public Moon(Long id, double cost, String defaultLayout, String difficulty, int maxScrap, int minScrap, String name, String risk, String weather) {
        this.id = id;
        this.cost = cost;
        this.defaultLayout = defaultLayout;
        this.difficulty = difficulty;
        this.maxScrap = maxScrap;
        this.minScrap = minScrap;
        this.name = name;
        this.risk = risk;
        this.weather = weather;
    }

    public Moon(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDefaultLayout() {
        return defaultLayout;
    }

    public void setDefaultLayout(String defaultLayout) {
        this.defaultLayout = defaultLayout;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public int getMaxScrap() {
        return maxScrap;
    }

    public void setMaxScrap(int maxScrap) {
        this.maxScrap = maxScrap;
    }

    public int getMinScrap() {
        return minScrap;
    }

    public void setMinScrap(int minScrap) {
        this.minScrap = minScrap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRisk() {
        return risk;
    }

    public void setRisk(String risk) {
        this.risk = risk;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "Moon{" +
                "id=" + id +
                ", cost=" + cost +
                ", defaultLayout='" + defaultLayout + '\'' +
                ", difficulty='" + difficulty + '\'' +
                ", maxScrap=" + maxScrap +
                ", minScrap=" + minScrap +
                ", name='" + name + '\'' +
                ", risk='" + risk + '\'' +
                ", weather='" + weather + '\'' +
                '}';
    }
}