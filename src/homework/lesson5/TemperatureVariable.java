package homework.lesson5;

import javax.swing.*;
import java.util.Scanner;

public class TemperatureVariable {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.println("Enter a temperature: ");
        double temperature = temp.nextDouble();
        if (temperature < 10) {
            System.out.println("Wear a jacket!");
        } else if (temperature >= 10 && temperature <= 25) {

                System.out.println("It's a nice day!");
            }
            else if (temperature > 25) {
                System.out.println("It's very hot, stay hydrated!");
            }
        }

    }



