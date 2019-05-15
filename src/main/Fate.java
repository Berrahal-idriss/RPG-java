package main;

public class Fate {
    //Default Constructor//
    public Fate() {
    }

    //other Constructor//
    public Fate(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    //Attributs
    private String name;
    private int damage;
}
