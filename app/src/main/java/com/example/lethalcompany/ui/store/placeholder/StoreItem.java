package com.example.lethalcompany.ui.store.placeholder;

import java.io.Serializable;

public class StoreItem implements Serializable {

    private Long id;
    private String name;
    private String battery;
    private String conductive;
    private String foto;
    private String info;
    private double price;
    private String type;
    private double weight;

    public StoreItem(Long id, String name, String battery, String conductive, String foto, String info, double price, String type, double weight) {
        this.id = id;
        this.name = name;
        this.battery = battery;
        this.conductive = conductive;
        this.foto = foto;
        this.info = info;
        this.price = price;
        this.type = type;
        this.weight = weight;
    }
    public StoreItem(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getConductive() {
        return conductive;
    }

    public void setConductive(String conductive) {
        this.conductive = conductive;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
