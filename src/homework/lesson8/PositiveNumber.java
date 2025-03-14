package homework.lesson8;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Please enter a positive integer");
        } else {
            int sum = 0;
            while (number != 0) {

                sum += number % 10;
                number = number / 10;
            }
            System.out.println("The sum of the digits is: " + sum);
        }
    }
}
