package homework.lesson7;

import java.util.Scanner;

public class PositiveInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int number = scanner.nextInt();
        if (number <= 1) {
            System.out.println("Enter a positive integer"); }
        else {
            int reverse = 0 ;
            while (number >= 1) {
                reverse = reverse * 10 + number % 10;
                number = number / 10;
            }
            System.out.println(reverse);
        }
    }
}
