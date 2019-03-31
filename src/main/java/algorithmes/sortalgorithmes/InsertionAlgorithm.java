package algorithmes.sortalgorithmes;

import java.util.Arrays;

public class InsertionAlgorithm {

    public static void main(String[] args) {
        int[] array = { 5, 89, 5, -4, 0, 56, 3, 2, 6, -9 };
        insertIntoSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void insertIntoSort(int[] arr){
        int temp, j;
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i + 1]){
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                j = i;
                while (j > 0 && temp < arr[j - 1]){
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = temp;
            }
        }
    }
}
