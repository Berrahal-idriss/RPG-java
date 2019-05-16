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

    public String setName() {
        return name;
    }

    public String setImg() {
        return image;
    }

    public int setHealth() {
        return health;
    }

    public int setDamage() {
        return damage;
    }


}
