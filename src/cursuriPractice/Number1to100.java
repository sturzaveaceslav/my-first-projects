package cursuriPractice;
// Cere utilizatorului sa introduca un numar intre 1 si 100. Daca numarul nu este in acest interval, cere introducerea unui nou numar.
// aici folosim while si do while

import java.util.Scanner;

public class Number1to100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        // AICI FOLOSIM METODA DO - WHILE
/*       do {
            System.out.print("Enter a number from 1 to 100: ");
            number = sc.nextInt();
        }
        while (number < 1 || number > 100);
        System.out.println("The number is: " + number); */
        // de aici, while simplu
        while (true) {
            System.out.print("Enter a number from 1 to 100: ");
            number = sc.nextInt();
            if (number >= 1 && number <= 100) {
                System.out.println(number + " is a number between 1 and 100");
                number = sc.nextInt();
            }
        }

    }

}
