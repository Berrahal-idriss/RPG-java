package main;

public class Weapon {
    //Default Constructor//
    public Weapon() {
    }

    //other Constructor//
    public Weapon(String name, int damage) {
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
