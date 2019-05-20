package main;

public class Personnage {
    protected String name;
    protected String image;
    protected int health;
    protected int damage;

    //Default constructor
    public Personnage()
    {

    }
    //Others Constructor
    public Personnage(String name, String image,int health,int damage)
    {
        this.name = name;
        this.image = image;
        this.health = health;
        this.damage = damage;
    }
            //Methods//
            public String toString() {

                return " Name:" + this.name + "\n" +
                        "Image:" + this.image + "\n" +
                        " Health:" + this.health + "\n" +
                        " Damage:" + this.damage + "\n";

            }

    //getters

    public String getName() {
        return name;
    }

    public String getImg() {
        return image;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    //setter

    public void setName(String name) {
        this.name = name;
    }

    public void setImg(String image) {
        this.image = image;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;

    }


}
