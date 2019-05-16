package main;


public class Warrior extends Personnage {
    //DefaultConstructors
    public Warrior() {
    }

    //Other Constructors
    public Warrior(String name) {
    }
    public Warrior(String name, String image, int health, int damage, String weaponName,int weaponDamage, String shield) {

        this.name = name;
        this.image = image;
        this.health = health;
        this.damage = damage;
        Weapon arme = new Weapon (weaponName,weaponDamage);
        this.weapon = arme;
        this.shield = shield;
    }



                //Methods


    //getters


    public Weapon getWeapon() {
        return weapon;
    }

    public String getShield() {
        return shield;
    }

    //setters

    public Weapon setWeapon() {
        return weapon;
    }

    public String setShield() {
        return shield;
    }

    public String toString() {

        return " Name:" + this.name + "\n" +
                " Health:" + this.health + "\n" +
                " Damage:" + this.damage + "\n" +
                " Weapon name:" + this.weapon + "\n" +
                " Shield:" + this.shield;
    }

    //Attributs
    private String name;
    private String image;
    private int health;
    private int damage;
    private Weapon weapon;
    private String shield;
}


