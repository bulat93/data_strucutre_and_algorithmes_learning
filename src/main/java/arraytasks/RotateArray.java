package arraytasks;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        rotate(array, 4);
        System.out.println(Arrays.toString(array));
    }

    private static void rotate(int[] nums, int k) {
        if(nums == null || nums.length < 2){
            return;
        }

        k = k % nums.length;
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        int tmp = 0;
        while(start < end){
            tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
}
