package com.example.lethalcompany.ui.bestiary.placeholder;

import java.io.Serializable;

public class Bestiary implements Serializable {

    private long id;
    private String damage;
    private String doorOpen;
    private String foto;
    private int health;
    private String info;
    private String mapFav;
    private int maxSpawn;
    private String name;
    private int power;
    private String shock;

    public Bestiary() {
    }

    public Bestiary(long id, String damage, String doorOpen, String foto, int health, String info, String mapFav, int maxSpawn, String name, int power, String shock) {
        this.id = id;
        this.damage = damage;
        this.doorOpen = doorOpen;
        this.foto = foto;
        this.health = health;
        this.info = info;
        this.mapFav = mapFav;
        this.maxSpawn = maxSpawn;
        this.name = name;
        this.power = power;
        this.shock = shock;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getDoorOpen() {
        return doorOpen;
    }

    public void setDoorOpen(String doorOpen) {
        this.doorOpen = doorOpen;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getMapFav() {
        return mapFav;
    }

    public void setMapFav(String mapFav) {
        this.mapFav = mapFav;
    }

    public int getMaxSpawn() {
        return maxSpawn;
    }

    public void setMaxSpawn(int maxSpawn) {
        this.maxSpawn = maxSpawn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getShock() {
        return shock;
    }

    public void setShock(String shock) {
        this.shock = shock;
    }
}
