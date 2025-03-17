package homework.lesson8;

import java.util.Scanner;

public class ArrayType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + i + " element: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("The array is: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
