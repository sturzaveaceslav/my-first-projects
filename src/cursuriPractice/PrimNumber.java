package cursuriPractice;


import java.util.Scanner;
// Scrie un program care cere utilizatorului un numar N si afiseaza primele N numere prime

public class PrimNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to display all prime numbers :"); //Introduceti un numar pentru a afisa toate numerele prime:
        int number = sc.nextInt();


        for (int n = 2; n < number; n++) {
            if (isPrime(n)) {
                System.out.print(n + " ");
            }
        }

    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;

        }
        return true;


    }
}

