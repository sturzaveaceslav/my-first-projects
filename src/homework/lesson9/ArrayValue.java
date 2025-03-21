package homework.lesson9;

import org.jetbrains.annotations.Contract;

import java.util.Scanner;

// Write a Java program to test if an array contains a specific value.
public class ArrayValue {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int value = sc.nextInt();
        if (containsValue(array, value)) {
            System.out.println("The array contains the value " + value);
        } else {
            System.out.println("The array does not contain the value " + value);
        }
    }

    @Contract(pure = true)
    public static boolean containsValue(int[] array, int value) {
        for (int element : array) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }
}
