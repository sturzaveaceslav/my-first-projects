package homework.lesson6;

import java.util.Scanner;

public class Simplify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a temperature: ");
        double temperature = sc.nextDouble();
        if (temperature < 10) {
            System.out.println("Wear a jacket!");
            int maxTemp, minTemp;
            maxTemp = 40;
            minTemp = 0;
            if (temperature > maxTemp) {
                System.out.println("Porridge is too hot.");
            } else if (temperature < minTemp) {
                System.out.println("Porridge is too cold.");
            } else {
                System.out.println("Porridge is just right.");
            }

        }
    }
}
