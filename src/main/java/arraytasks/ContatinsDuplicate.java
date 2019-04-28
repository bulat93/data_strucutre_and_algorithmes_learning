package arraytasks;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ContatinsDuplicate {

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5};
        System.out.println(containsDuplicate(array));
    }

    private static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }

}
