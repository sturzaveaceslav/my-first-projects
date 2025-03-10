package homework.lesson6;

import java.util.Scanner;

public class AgeCategories {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        String ageCategory;

        ageCategory = (age < 18) ? "Minor" : (age >= 18 && age <= 29) ? "Young" : (age >= 30 && age <= 64) ?
        "Adult" : "Senior";
        System.out.println(ageCategory);


    }
}

