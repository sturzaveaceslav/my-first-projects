package homework.lesson8;

import java.util.Scanner;

public class LargePositiveNumber {
    public static void main(String[] args) {
       int number = 101;

       while (true) {
           if (number % 7 == 0 && number % 9 == 0) {
               System.out.println(number);
               break;
           }
           number++;
       }

    }
}
