package homework.lesson9;

public class MaximumMinimumValue {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }

        }
        System.out.println("Minimum number is: " + min);
        System.out.println("Maximum number is: " + max);

    }
}
