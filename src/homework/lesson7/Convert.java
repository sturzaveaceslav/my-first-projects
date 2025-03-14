package homework.lesson7;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double usdToEur = 0.85;
        double usdToGbp = 0.75;
        double usdToInr = 75.0;
        double usdToAud = 1.35;

        System.out.println("The valuta is ");
        String currencyCode = sc.nextLine().toUpperCase();
        System.out.println("Enter the valute in USD");

        double usdVal = sc.nextDouble();
        double convertValue = 0.0;
        boolean validCurrency = true;

        switch (currencyCode) {
            case "EUR":
                convertValue = usdVal * usdToEur;
                break;
            case "GBp":
                convertValue = usdVal * usdToGbp;
                break;
            case "INr":
                convertValue = usdVal * usdToInr;
                break;
            case "AUd":
                convertValue = usdVal * usdToAud;
                break;
            default:
                validCurrency = false;

        }
     if (validCurrency) {
         System.out.println("The valuta is " + convertValue + currencyCode); }
     else {
         System.out.println("Unsupported currency " + convertValue);
     }
    }
}
