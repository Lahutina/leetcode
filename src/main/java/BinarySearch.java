/*
https://leetcode.com/problems/binary-search/
 */

public class BinarySearch {
    public static int search(int[] nums, int target) {
        int index = nums.length / 2;

        return recSearch(nums, target, index);
    }
    public static int recSearch(int[] nums, int target, int index) {
        if (index < 0 || index > nums.length) return -1;
        else if (nums[index] > target && nums[index - 1] < target) return -1;
        else if (nums[index] == target) return index;
        else if (nums[index] > target) return recSearch(nums, target, index - 1);
        else return recSearch(nums, target, index + 1);
    }
}
