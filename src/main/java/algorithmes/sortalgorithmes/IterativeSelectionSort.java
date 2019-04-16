package algorithmes.sortalgorithmes;

import java.util.Arrays;

public class IterativeSelectionSort
{

    public static void main(String[] args)
    {
        int[] array = {5, 89, 5, -4, 0, 56, 3, 2, 6, -9};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void selectionSort(int[] arr)
    {
        for (int min = 0; min < arr.length - 1; min++)
        {
            int least = min;
            for (int j = min + 1; j < arr.length; j++)
            {
                if (arr[j] < arr[least])
                {
                    least = j;
                }
            }
            int tmp = arr[min];
            arr[min] = arr[least];
            arr[least] = tmp;
        }
    }
}
