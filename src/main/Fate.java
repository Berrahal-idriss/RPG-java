package main;

public class Fate extends Wizard {
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

    public void setName(String name)
    {
        this.name = name;
    }

    //Methods
    public String toString() {

        return "\n"+" Name:" + this.name + "\n" +
                " Damage:" + this.damage ;

    }
    //Attributs
    private String name;
    private int damage;
}
