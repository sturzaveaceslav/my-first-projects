package homework.lesson8;


import org.jetbrains.annotations.NotNull;

public class OneDimensional {
    public static void main(String[] args) {

int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            int sum = 0, evenCount = 0, oddCount = 0;
            for (int num : arr) {
                sum += num;
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
            double average = (double) sum / arr.length;
            System.out.println("One Dimensional: ");
            System.out.println("Sum = " + sum);
            System.out.println("Average = " + average);
            System.out.println("Events = " + evenCount);
            System.out.println("Odd = " + oddCount);

        }

    }

