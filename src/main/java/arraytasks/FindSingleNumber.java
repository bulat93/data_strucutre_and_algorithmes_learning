package arraytasks;

public class FindSingleNumber {

    public static void main(String[] args) {
        int[] array = {0, 0, 1, 1, 2, 3, 4, 5};
        int result = singleNumber(array);
        System.out.println(result);
    }

    private static int singleNumber(int[] nums) {
        for(int i = 1; i < nums.length; i++)
            nums[0] ^= nums[i];

        return nums[0];
    }
}
