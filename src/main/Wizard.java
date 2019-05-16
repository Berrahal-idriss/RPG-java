package main;


public class Wizard extends Personnage{

    //Default Constructors
    public Wizard() {
    }

    //Other Constructors

    public Wizard(String name) {
    }

    public Wizard(String name, String image, int health, int damage, String fateName,int fateDamage, String potion) {
        this.name = name;
        this.image = image;
        this.health = health;
        this.damage = damage;
        this.potion = potion;
        Fate sort = new Fate(fateName,fateDamage);
        this.fate = sort;
    }

                    //Methods//

    //getters


    public Fate getFate() {
        return fate;
    }

    public String getPotion() {
        return potion;
    }

    //setter


    public Fate setFate() {
        return fate;
    }

    public String setPotion() {
        return potion;
    }


    public String toString() {

        return " Name:" + this.name +
                " Health:" + this.health +
                " Damage:" + this.damage +
                " Weapon name:" + this.fate +
                " Shield:" + this.potion;
    }

    //Atributs

    private String name;
    private String image;
    private int health;
    private int damage;
    private Fate fate;
    private String potion;
}