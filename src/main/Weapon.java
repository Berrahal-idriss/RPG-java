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

    //Methods
    public String toString() {

        return "\n"+" Weapon Name:" + this.name + "\n" +
                " Weapon Damage:" + this.damage ;

    }
    //Attributs
    private String name;
    private int damage;
}
