import java.util.Arrays;
// Write a Java program to find the maximum and minimum value of an array.
public class CopyArray {
    public static void main(String[] args) {

        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};


        int[] copiedArray = new int[originalArray.length];


        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));
    }
}
