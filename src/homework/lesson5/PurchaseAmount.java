package homework.lesson5;

import java.util.Scanner;

public class PurchaseAmount {
    public static void main(String[] args) {
        float totalCost, totalAmount, discount;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your amount: ");
        totalCost = input.nextFloat();
        if (totalCost <= 100) {
            totalAmount = totalCost;
            System.out.println("Sorry, you do not receive a discount.");
        } else if (totalCost > 100) {

            discount = (totalCost * 10) / 100;
            totalAmount = totalCost - discount;
            System.out.println("Congratulations, you have a -10% discount");
            System.out.println("Total to be paid: " + totalAmount + "Mdl");
        }

    }

}

