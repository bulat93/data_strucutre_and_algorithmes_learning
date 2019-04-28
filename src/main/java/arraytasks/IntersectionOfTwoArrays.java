package arraytasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] num1 = {100, 123, 4, 9, 86, 1};
        int[] num2 = {1, 11, 4, 9, 86, 100};
        int[] intersection = intersect(num1, num2);
        System.out.println(Arrays.toString(intersection));
    }

    private static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int point1 = 0;
        int point2 = 0;
        List<Integer> list = new ArrayList<>();

        while (point1 < nums1.length && point2 < nums2.length) {
            if (nums1[point1] < nums2[point2]) {
                point1++;
            } else {
                if (nums1[point1] > nums2[point2]) {
                    point2++;
                } else {
                    list.add(nums1[point1]);
                    point1++;
                    point2++;
                }
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }

        return result;
    }
}
