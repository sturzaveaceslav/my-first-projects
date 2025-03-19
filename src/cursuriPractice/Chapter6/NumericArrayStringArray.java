package cursuriPractice.Chapter6;

import java.util.Arrays;

public class NumericArrayStringArray {
    public static void main(String[] args) {
        int[] intArray = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};
        String[] stringArray = {"java", "pyton", "php", "C#", "C Prgraming", "C++"};

        int[] sortedArray = sortArray(intArray);
        System.out.println("Array sorted in ascending order" + Arrays.toString(sortedArray));
        System.out.println("\n\nOriginal numeric array:" + Arrays.toString(intArray));
        System.out.println("Sorted numeri array" + Arrays.toString(intArray));
        System.out.println("Original string array" + Arrays.toString(stringArray));
        System.out.println("Original string array" + Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("Sorted string array:" + Arrays.toString(stringArray));


    }
    public static int[] sortArray(int[] intArray) {
        int[] arrayToSort = intArray.clone();
        for (int i = 0; i < arrayToSort.length; i++) {
            for (int j = i + 1; j < arrayToSort.length; j++) {
                if (arrayToSort[i] > arrayToSort[j]) {
                    int temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[j];
                    arrayToSort[j] = temp;
                }
            }
        }
        return arrayToSort;
    }

}