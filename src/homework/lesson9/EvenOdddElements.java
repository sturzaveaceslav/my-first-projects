package homework.lesson9;

import java.util.Scanner;

public class EvenOdddElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("The array must contain at least one element!  ");
            return;
        }
            int[] array = new int[n];
            int evenCount = 0, oddCount = 0;
            System.out.println("Enter " + n + " numbers: ");
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
                if (array[i] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;

                }

            }
        System.out.println("Odd count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
        }
}

