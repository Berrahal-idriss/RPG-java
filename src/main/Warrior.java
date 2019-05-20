package main;


public class Warrior extends Personnage {

    //Attributs
    private String className;
    private Weapon weapon;
    private String shield;

    //DefaultConstructors
    public Warrior() {
    }

    //Other Constructors
    public Warrior(String name) {

    }
    public Warrior(String className,String name, String image, int health, int damage, String weaponName,int weaponDamage, String shield) {
        super(name,image,health,damage);
        this.className = className;
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

        return "1) Name:" + this.name + "\n" +
                " 2)Health:" + this.health + "\n" +
                " 3)Damage:" + this.damage + "\n" +
                " 4)Weapon:" + this.weapon  +
                " 5)Shield:" + this.shield;
    }


}


