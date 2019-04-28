package arraytasks;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 4, 5};
        int length = removeDuplicate(array);
        for (int i = 0; i < length; i++)
            System.out.print(array[i] + " ");
    }

    private static int removeDuplicate(int[] nums) {
        int start = 0;
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] != nums[start]) {
                nums[++start] = nums[end];
            }
        }
        return start + 1;
    }
}
