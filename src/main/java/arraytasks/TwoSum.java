package arraytasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum
{

    public static void main(String[] args)
    {
        int[] array = {3, 2, 3, 10};
        int[] result = twoSum(array, 12);
        System.out.println(Arrays.toString(result));
    }

    private static int[] twoSum(int[] nums, int target){
        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(target - nums[i])){
                int j = map.get(target - nums[i]);
                return new int[]{j, i};
            }

            map.put(nums[i], i);
        }

        return new int[]{0, 0};
    }
}
