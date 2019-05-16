package main;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Enumeration;
import java.util.Hashtable;

public class main {
    //Création des tableau contenant les objets Wizard et Warrior
    public static ArrayList listPerso = new ArrayList();


    public static void main(String[] args) {
//        for(int i=0;i <= 5;i++){
        String create = "";
        //Création d'un nouvel objet de la class Scanner
        Scanner scanner = new Scanner(System.in);
        do {
            //affichage du menu principal(appel de la fonction main menu)
            mainMenu();

            System.out.println(" 1) Show resume menu, 2)Quit the program");

            // concatenation de l'input dans la variable create
            create = scanner.nextLine();

            // minusculisation des caracteres
            create = create.toUpperCase();
        } while (create.equals("1"));

    }

    public static void afficheMenu() {
        System.out.println("List of Characters:");
        // boucle permetant d'afficher tout les personnages créé
        for (int v = 0; v < listPerso.size(); v++) {
            if (listPerso.get(v) != null) {
                System.out.println(listPerso.get(v));
            }
        }
        System.out.println("Do you Want to create an other Character or quit?");
        System.out.println("");
    }
    public static void createCharacter() {
        String characterClass = "";
        int i = 0;
        int j = 0;
        System.out.println("Are you a wizard or a warrior ?");
        //création d'un nouvel objet de la classe Scanner
        Scanner scanner = new Scanner(System.in);
        characterClass = scanner.nextLine();
        characterClass = characterClass.toLowerCase();
        String className = characterClass;
        System.out.println("class: " + characterClass);
        //if is a Wizard
        if (characterClass.equals("wizard")) {

            System.out.println("what's your name");
            String name = scanner.nextLine();
            System.out.println("you are a " + characterClass + " " + name);
            listPerso.add(name);
            System.out.println(" copy the link of your avatar's image or just click ENTER to pass this step");
            String image = scanner.nextLine();
            System.out.println("image: " + image);
            listPerso.add(image);
            System.out.println("how much health do you have ? (between 5/10)");
            int health = scanner.nextInt();
            System.out.println("health: " + health);
            listPerso.add(health);
            System.out.println("how much damage do you inflict? (between 5/10)");
            int damage = scanner.nextInt();
            System.out.println("damage: " + damage);
            listPerso.add(damage);
            System.out.println("what's the name of your fate? be inventive!");
            scanner.nextLine();
            String fateName = scanner.nextLine();
            System.out.println("fate: " + fateName);
            listPerso.add(fateName);
            System.out.println("how much damage inflict " + fateName + "? be inventive!");
            int fateDamage = scanner.nextInt();
            System.out.println("fate: " + fateDamage);
            listPerso.add(fateDamage);
            System.out.println("what's the name of your potion?");
            scanner.nextLine();
            String potion = scanner.nextLine();
            System.out.println("potionName: " + potion);
            listPerso.add(potion);
            //Création d'un nouvel objet Wizard et concatenation dans le tableau tabWiz
            //tabPers[i] = new Wizard(className,name, image, health, damage, fateName, fateDamage, potion);


        } else if (characterClass.equals("warrior")) {

            System.out.println("what's your name");
            String name = scanner.nextLine();
            System.out.println("you are a " + characterClass + " " + name);
            listPerso.add(name);
            System.out.println("choose you img or just click ENTER to pass this step");
            String image = scanner.nextLine();
            System.out.println("image: " + image);
            listPerso.add(image);
            System.out.println("how much health do you have ? (between 5/10)");
            int health = scanner.nextInt();
            System.out.println("health: " + health);
            listPerso.add(health);
            System.out.println("how much damage do you inflict? (between 5/10)");
            int damage = scanner.nextInt();
            System.out.println("damage: " + damage);
            listPerso.add(damage);
            System.out.println("what's the name of your weapon? be inventive!");
            scanner.nextLine();
            String weaponName = scanner.nextLine();
            System.out.println("weaponName: " + weaponName);
            listPerso.add(weaponName);
            System.out.println("how much damage inflict " + weaponName + "? be inventive!");
            int weaponDamage = scanner.nextInt();
            System.out.println("weaponName: " + weaponDamage);
            listPerso.add(weaponDamage);
            System.out.println("what's the name of your shield?");
            scanner.nextLine();
            String shield = scanner.nextLine();
            System.out.println("shieldName: " + shield);
            listPerso.add(shield);
            //Création d'un nouvel objet Wizard et concatenation dans le tableau tabWar
            //tabPers[j] = new Warrior(className,name, image, health, damage, weaponName, weaponDamage, shield);

//                System.out.println(" Class:" + characterClass + " \n" + " Name:" + name + "\n" + " Img:" + image + "\n" + " Health:" + health + "\n" + " Damage:" + damage + "\n" + " Weapon name:" + weaponName + "\n" + " Shield:" + shield);

        } else {
            System.out.println("Choix de classe invalide!");
        }
    }
    public static void mainMenu() {
        Scanner scannerChoice = new Scanner(System.in);
        System.out.println("1)Create an other character" + "\n" + "2)Show Characters" + "\n" + "3)Remove a character" + "\n" + "4)Modify a character" + "\n" + "5)Quit");

        String choice = scannerChoice.nextLine();
        if (choice.equals("1")) {
            createCharacter();
        } else if (choice.equals("2")) {
            afficheMenu();
        } else if (choice.equals("3")) {
            //Supprimer un personnage
        } else if (choice.equals("4")) {
            //Modifier infos personnage
        } else {
            System.exit(0);
        }
    }
    public static void deleteCharacter(){

    }
    public static void modifyCharacter()
    {

    }

}

