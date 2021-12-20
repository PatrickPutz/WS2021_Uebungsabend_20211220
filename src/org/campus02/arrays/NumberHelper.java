package org.campus02.arrays;

import java.util.Arrays;

public class NumberHelper {

    public static void main(String[] args) {

        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] unsortedArray = {1, 2, 3, 4, 6, 5, 7, 8};

        System.out.println("isSortedArray(sortedArray) = " + isSortedArray(sortedArray));
        System.out.println("isSortedArray(unsortedArray) = " + isSortedArray(unsortedArray));
        System.out.println("___________________");

        int[] duplicatesArray = {1, 5, 3, 1, 9, 2, 5};

        System.out.println("removeDuplicates(duplicatesArray) = " + Arrays.toString(removeDuplicates(duplicatesArray)));
        System.out.println("removeDuplicates(sortedArray) = " + Arrays.toString(removeDuplicates(sortedArray)));

    }

    public static boolean isSortedArray(int[] numbers){
        for(int i = 0; i < numbers.length - 1; i++){
            if(numbers[i] > numbers[i + 1]){
                return false;
            }
        }
        return true;
    }

    public static int[] removeDuplicates(int[] numbers){
        // int[] result = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0)
                continue;

            for(int j = i + 1; j < numbers.length; j++){
                if (numbers[i] == numbers[j]){
                    numbers[j] = -1;
                }
            }
        }

        return numbers;
    }

}
