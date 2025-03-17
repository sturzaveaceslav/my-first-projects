package cursuriPractice;
/*
Crearea unui meniu interactiv: Vrem sa implementam un meniun interactic in consola Java, unde utilizatorul poate alege optiuni diferite pina cind decidem sa iasa din program:
Cerine: 1. Afiseaza un mesaj de salut; 2. Cere utilizatorului doua numere pentru a afisa suma;
3. Afuseaza ora curenta; 4. Inchide programul. Programul trebuie sa continue sa ruleze pina cind utilizatorul alege optiunea 4.
 */

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("Welcome to the menu");
            System.out.println("1. Display a message");
            System.out.println("2. Calculate the sum of two numbers");
            System.out.println("3. Displays the current date.");
            System.out.print("4. Exit ");

            System.out.print("Choose an option from the MENU:  ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Hello! ");
                    break;
                case 2:
                    System.out.println("Enter the first number");
                    int a = sc.nextInt();
                    System.out.println("Enter the second number");
                    int b = sc.nextInt();
                    System.out.println("The sum of two numbers is: " + (a + b));
                    break;
                case 3:
                    System.out.println("Enter the current time" + new java.util.Date());
                    break;
                case 4:
                    System.out.println("Exit the program");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
        while (option != 4);

    }
}
