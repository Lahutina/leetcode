/*
https://leetcode.com/problems/binary-search/
 */

public class BinarySearch {

    public int search(int[] nums, int target) {
        return recSearch(nums, 0, nums.length - 1, target);
    }
    public static int recSearch(int[] nums, int start, int end, int target) {
        if (start > end) return -1;
        int middle = (start) + (end - start) / 2;

        if (nums[middle] == target) return middle;
        else if (nums[middle] > target) return recSearch(nums, start, middle - 1, target);
        else return recSearch(nums, middle + 1, end, target);
    }
}
