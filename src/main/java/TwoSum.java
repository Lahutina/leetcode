/*
https://leetcode.com/problems/two-sum/description/
 */

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] resIndex = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ((nums[i] + nums[j] == target) && i != j) {
                    resIndex[0] = i;
                    resIndex[1] = j;
                    return resIndex;
                }
            }
        }
        return resIndex;
    }
}
