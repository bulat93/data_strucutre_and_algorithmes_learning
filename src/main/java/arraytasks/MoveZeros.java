package arraytasks;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {
        int[] nums = {0,0,3,4,5,6, 123, 0, 1234, 1, 2};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void moveZeroes(int[] nums) {

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                int j = i;
                while (nums[j] == 0 && j < nums.length - 1){
                    j++;
                }
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
    }

}
