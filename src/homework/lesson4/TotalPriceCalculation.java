package homework.lesson4;

public class TotalPriceCalculation {
    public static void main(String[] args) {
        int coffeMachinePrice = 18450;
        int aCupPrice = 112;
        int coffeBox = 1500;
        int totalPrice = coffeMachinePrice + aCupPrice + coffeBox;
        float discountPercentage = 0.1f;
        float totalPriceWithDiscountPercentage = totalPrice - discountPercentage * totalPrice;




        System.out.println("The total amount is: " + totalPrice + " mdl");
        System.out.println("The total amount with a 10% discount is " + totalPriceWithDiscountPercentage + " mdl");
    }
}
