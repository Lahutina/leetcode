/*
https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
*/

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[k - 1] != nums[i]) {
                nums[k++] = nums[i];
            }
        }

        return k;
    }

    public int removeDuplicates1(int[] nums) {
        int[] distinctNums = Arrays.stream(nums)
                .distinct()
                .toArray();

        System.arraycopy(distinctNums, 0, nums, 0, distinctNums.length);

        return distinctNums.length;
    }
}
