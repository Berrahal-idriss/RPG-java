package main;

import java.util.Scanner;

public class main {
    public static Wizard[] tabWiz = new Wizard[10];

    public static Warrior[] tabWar = new Warrior[10];


    public static void main(String[] args) {
//        for(int i=0;i <= 5;i++){
        String create = "";

        do {    mainMenu();
            String characterClass = "";

            Scanner scanner = new Scanner(System.in);


            System.out.println("Are you a wizard or a warrior ?");

            characterClass = scanner.nextLine();
            characterClass = characterClass.toLowerCase();
            System.out.println("class: " + characterClass);
            //if is a Wizard
            if (characterClass.equals("wizard")) {
                System.out.println("what's your name");
                String name = scanner.nextLine();
                System.out.println("you are a " + characterClass + " " + name);
                System.out.println(" copy the link of your avatar's image or just click ENTER to pass this step");
                String image = scanner.nextLine();
                System.out.println("image: " + image);
                System.out.println("how much health do you have ? (between 5/10)");
                int health = scanner.nextInt();
                System.out.println("health: " + health);
                System.out.println("how much damage do you inflict? (between 5/10)");
                int damage = scanner.nextInt();
                System.out.println("damage: " + damage);
                System.out.println("what's the name of your fate? be inventive!");
                scanner.nextLine();
                String fateName = scanner.nextLine();
                System.out.println("fate: " + fateName);
                System.out.println("how much damage inflict"+fateName+"? be inventive!");
                int fateDamage = scanner.nextInt();
                System.out.println("fate: " + fateDamage);
                System.out.println("what's the name of your potion? be inventive!");
                scanner.nextLine();
                String potion = scanner.nextLine();
                System.out.println("potionName: " + potion);
//
            } else if (characterClass.equals("warrior")) {
                System.out.println("what's your name");
                String name = scanner.nextLine();
                System.out.println("you are a " + characterClass + " " + name);
                System.out.println("choose you img or just click ENTER to pass this step");
                String image = scanner.nextLine();
                System.out.println("image: " + image);
                System.out.println("how much health do you have ? (between 5/10)");
                int health = scanner.nextInt();
                System.out.println("health: " + health);
                System.out.println("how much damage do you inflict? (between 5/10)");
                int damage = scanner.nextInt();
                System.out.println("damage: " + damage);
                System.out.println("what's the name of your weapon? be inventive!");
                scanner.nextLine();
                String weaponName = scanner.nextLine();
                System.out.println("weaponName: " + weaponName);
                System.out.println("how much damage inflict "+weaponName+"? be inventive!");
                int weaponDamage = scanner.nextInt();
                System.out.println("weaponName: " + weaponDamage);
                System.out.println("what's the name of your shield? be inventive!");
                String shield = scanner.nextLine();
                System.out.println("shieldName: " + shield);


//                System.out.println(" Class:" + characterClass + " \n" + " Name:" + name + "\n" + " Img:" + image + "\n" + " Health:" + health + "\n" + " Damage:" + damage + "\n" + " Weapon name:" + weaponName + "\n" + " Shield:" + shield);

            } else {
                System.out.println("Choix de classe invalide!");
            }


            // Numerical input


            // Output input by user


//        System.out.println("potion: " + potion);
//
//        System.out.println("Name: " + name);
//        System.out.println("image: " + image);
//        System.out.println("health: " + health);
//        System.out.println("damage: " + damage);
//        System.out.println("weaponName: " + weaponName);
//        System.out.println("potion: " + potion);

            System.out.println(" ENTER keypress to show resume menu, CREATE to create an other character");
            create = scanner.nextLine();
            create = create.toUpperCase();
        } while (create.equals("CREATE"));


    }

    public static void afficheMenu() {
        System.out.println("List of Wizards:");
        for (int v = 0; v < tabWiz.length; v++) {
            if (tabWiz[v] != null) {
                System.out.println(tabWiz[v]);

            }
        }

        System.out.println("List of Warriors:");
        for (int v = 0; v < tabWar.length; v++) {
            if (tabWar[v] != null) {
                System.out.println(tabWar[v]);
            }
        }
        System.out.println("Do you Want to create an other Character or quit??");
        System.out.println("");
    }
    public static void mainMenu() {
        Scanner scannerChoice = new Scanner(System.in);
        System.out.println("1)Create an other character"+"\n"+"2)Show Characters"+"\n"+"3)Remove a character"+"\n"+"4)Modify a character"+"\n"+"5)Quit");

        String choice = scannerChoice.nextLine();
        if(choice.equals("1"))
        {

        }
        else if(choice.equals("2"))
        {
            afficheMenu();

        }
        else if(choice.equals("3"))
        {
           //Supprimer un personnage
        }
        else if(choice.equals("4"))
        {
            //Modifier infos personnage
        }
        else
        {
            System.exit(0);
        }
    }
}

