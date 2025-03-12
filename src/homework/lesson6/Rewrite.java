package homework.lesson6;

import java.util.Scanner;

public class Rewrite {
    public static void main(String[] args) {
        System.out.println("Rewrite the given code to use ternary if instead of swich ");
        Scanner sc = new Scanner(System.in);
        int colorCode = 101;
        String color = (colorCode == 100) ? "Yellow" : (colorCode == 101) ? "Green" : (colorCode == 102) ? "Red" : "Invalid";

        System.out.println("The color is " + color);

    }
}
