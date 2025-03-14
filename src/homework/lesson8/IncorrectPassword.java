package homework.lesson8;

import java.util.Scanner;

public class IncorrectPassword {
    public static void main(String[] args) {
        String password = "usher";
        Scanner sc = new Scanner(System.in);

        int testing = 0;

        while (testing < 3) {
            System.out.println("Enter a password:");
            String incorectPassword = sc.nextLine();

            if (incorectPassword.equals(password)) {
                System.out.println("Authentication successful! You have access!!! You have been successfully logged in! ");
                break;
            } else {
                testing++;
                System.out.println("You entered the wrong password  " + (3 - testing) +
                        "  Try again");
            }
            if (testing == 3) {
                System.out.println("You have been blocked. Contact the administrator!!! ");
            }
        }
    }
}
