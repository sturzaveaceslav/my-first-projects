package homework.lesson8;

import java.util.Scanner;

public class ParkingGarage {
    public static double CalculateCharges(int hours) {
        if (hours <= 3) {
            return 2.00;
        } else if (hours < 24) {
            double charge = 2.00 + (hours - 3) * 0.50;
            return charge;
        } else {
            return 10.00;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalrevenue = 0;
        System.out.println("Enter the number of customers:");
        int numClient = sc.nextInt();

        for (int i = 0; i < numClient; i++) {
            System.out.println("Enter the number of hours for the client " + (i + 1) + "");
            int hours = sc.nextInt();
            if (hours > 24) {
                System.out.println("Error: A car cannot leave for more than 24 hours...");
                i--;
                continue;
            }
            double charges = CalculateCharges(hours);
            totalrevenue += charges;
            System.out.println("Fee for the client: " + (i + 1) + ": $" + charges);


        }
        System.out.println("\nTotal receipts for the day : $ " + +totalrevenue);


    }
}
