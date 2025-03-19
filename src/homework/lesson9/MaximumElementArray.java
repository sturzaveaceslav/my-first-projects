package homework.lesson9;

import java.util.Scanner;

public class MaximumElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("The array must contain at least one element! ");
            return;
        }
        int[] arr = new int[n];
        System.out.println("Enter" + n + "elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
            int maxVal = arr[0];
            int maxIndex = 0;
            for (int i = 1;
                 i < n;
                 i++) {
                if (arr[i] > maxVal) {
                    maxVal = arr[i];
                    maxIndex = i;
                }

            }
            System.out.println("The maximum value is:" + maxVal);
            System.out.println("Element at index " + maxIndex);
        }
    }

