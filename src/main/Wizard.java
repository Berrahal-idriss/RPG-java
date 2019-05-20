package main;


public class Wizard extends Personnage{

    //Atributs
    private String className;
    private Fate fate;
    private String potion;

    //Default Constructors
    public Wizard() {
    }

    //Other Constructors

    public Wizard(String name) {
    }

    public Wizard(String className,String name, String image, int health, int damage, String fateName,int fateDamage, String potion) {
        super(name,image,health,damage);
        this.className = className;

        this.potion = potion;
        Fate sort = new Fate(fateName,fateDamage);
        this.fate = sort;
    }

                    //Methods//

    //getters
    public String getClassName(){return className;}

    public Fate getFate() {
        return fate;
    }

    public String getPotion() {
        return potion;
    }

    //setter

    public String setclassName(){return className;}

    public Fate setFate() {
        return fate;
    }

    public String setPotion() {
        return potion;
    }


    public String toString() {

        return " 1)Name:" + this.name +"\n"+
                " 2)Health:" + this.health +"\n"+
                " 3)Damage:" + this.damage +"\n"+
                " 4)Weapon:" + this.fate +
                " 5)Shield:" + this.potion;
    }


}