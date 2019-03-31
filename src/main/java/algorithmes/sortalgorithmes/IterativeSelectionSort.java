package algorithmes.sortalgorithmes;

import java.util.Arrays;

public class IterativeSelectionSort {

    public static void main(String[] args) {
        int[] array = { 5, 89, 5, -4, 0, 56, 3, 2, 6, -9 };
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void selectionSort(int[] numbers){
        int min, temp;

        for (int index = 0; index < numbers.length-1; index++){
            min = index;
            for (int scan = index+1; scan < numbers.length; scan++){
                if (numbers[scan] < numbers[min])
                    min = scan;
            }

            // Swap the values
            temp = numbers[min];
            numbers[min] = numbers[index];
            numbers[index] = temp;
        }
    }
}
