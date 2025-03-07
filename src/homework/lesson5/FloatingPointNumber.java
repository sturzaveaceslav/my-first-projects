package homework.lesson5;

import java.util.Scanner;

public class FloatingPointNumber {
    public static void main(String[] args) {
        Scanner pn = new Scanner(System.in);
        System.out.println("Enter a floating point number: ");
        double num = pn.nextFloat();

        if (num > 0) {
            if (num < 1) {
                System.out.println("Small positive number: ");
            } else if (num > 1000000) {
                System.out.println("Extra positive number: ");
            } else {
                System.out.println("Positive number");

            }
        } else if (num < 0)
            if (num < 1) {
                System.out.println("NEgative number 2");
            } else {
                System.out.println("Negative number");
            }
        else if (num > 1000000) {
            System.out.println("Negativ number2");
        } else {
            System.out.println("zero");
        }

    }

}




