package main;
import java.util.ArrayList;
import java.util.Scanner;


public class main {
    //Création des tableau contenant les objets Wizard et Warrior
    public static ArrayList<Personnage> listPerso = new ArrayList();


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
                System.out.println(v + ")");
                System.out.println(listPerso.get(v) + "\n");
            }
        }

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

            System.out.println("how much damage inflict " + fateName + "? be inventive!");
            int fateDamage = scanner.nextInt();
            System.out.println("fate: " + fateDamage);

            System.out.println("what's the name of your potion?");
            scanner.nextLine();
            String potion = scanner.nextLine();
            System.out.println("potionName: " + potion);
            Personnage newPerso = new Wizard(className, name, image, health, damage, fateName, fateDamage, potion);
            listPerso.add(newPerso);
            //Création d'un nouvel objet Wizard et concatenation dans le tableau tabWiz
            //tabPers[i] = new Wizard(className,name, image, health, damage, fateName, fateDamage, potion);


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

            System.out.println("how much damage inflict " + weaponName + "? be inventive!");
            int weaponDamage = scanner.nextInt();
            System.out.println("weaponName: " + weaponDamage);

            System.out.println("what's the name of your shield?");
            scanner.nextLine();
            String shield = scanner.nextLine();
            System.out.println("shieldName: " + shield);
            Personnage newPerso = new Wizard(className, name, image, health, damage, weaponName, weaponDamage, shield);
            listPerso.add(newPerso);
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
            deleteCharacter();
        } else if (choice.equals("4")) {
            modifyCharacter();
        } else {
            System.exit(0);
        }
    }

    public static void deleteCharacter() {
        Scanner scanner = new Scanner(System.in);
        String choice;
        System.out.println("Wich character would you delete?");
        do{
            for(int v = 0; v < listPerso.size(); v++) {
                int w = v + 1;
                System.out.println(w + ")");
                System.out.println(listPerso.get(v) + "\n");
            }
            String index = scanner.nextLine();
            if(index.equals(null)) {
                System.out.println("Character already remove or no exist!");
            }
            else{
                listPerso.remove(index);
            }
            System.out.println("Charactere removed"+"\n"+"Would you 1)remove an other character or 2)go back to menu");
            choice = scanner.nextLine();
        } while (choice.equals("2"));

    }
        public static void modifyCharacter ()
        {
            Scanner scanner = new Scanner(System.in);
             int choice;
            String choiceStr;
            System.out.println("Wich character would you modify?");
            do{
                for(int v = 0; v < listPerso.size(); v++) {
                    int w = v + 1;
                    System.out.println(w + ")");
                    System.out.println(listPerso.get(v) + "\n");
                }

                choice = scanner.nextInt();
                scanner.nextLine();
                System.out.println( listPerso.get(choice));//int

                String modification;
                int modification2;
                System.out.println("would you modify the name? 1)yes 2)no");
                String choice2 = scanner.nextLine();
                if(choice2.equals("1"))
                {
                    modification = scanner.nextLine();
                    listPerso.get(choice).setName(modification);
                }
                System.out.println("would you modify the image? 1)yes 2)no");
                 choice2 = scanner.nextLine();
                if(choice2.equals("1"))
                {
                    modification = scanner.nextLine();
                    listPerso.get(choice).setImg(modification);
                }
                System.out.println("would you modify the health? 1)yes 2)no");
                choice2 = scanner.nextLine();
                if(choice2.equals("1"))
                {
                    modification2 = scanner.nextInt();
                    scanner.nextLine();
                    listPerso.get(choice).setHealth(modification2);
                }
                System.out.println("would you modify the damage? 1)yes 2)no");
                choice2 = scanner.nextLine();
                if(choice2.equals("1"))
                {
                    modification2 = scanner.nextInt();
                    scanner.nextLine();
                    listPerso.get(choice).setDamage(modification2);

                }
                System.out.println("would you modify the name? 1)yes 2)no");
                choice2 = scanner.nextLine();
                if(choice2.equals("1"))
                {
                    modification = scanner.nextLine();
                    listPerso.get(choice).setName(modification);
                }
                System.out.println("would you modify the name? 1)yes 2)no");
                choice2 = scanner.nextLine();
                if(choice2.equals("1"))
                {
                    modification = scanner.nextLine();
                    listPerso.get(choice).setName(modification);
                }
                System.out.println("would you modify the name? 1)yes 2)no");
                choice2 = scanner.nextLine();
                if(choice2.equals("1"))
                {modification2 = scanner.nextInt();
                    scanner.nextLine();
                    listPerso.get(choice).setDamage(modification2);
                }
                else if(choice2.equals("2"))
                {

                }

                System.out.println("Modifications applied"+"\n"+"Would you 1)remove an other character or 2)go back to menu");
                choiceStr = scanner.nextLine();
            }while(choiceStr.equals("2"));
        }
}

