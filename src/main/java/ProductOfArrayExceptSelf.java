/*
https://leetcode.com/problems/product-of-array-except-self/
 */

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int temp = 1;
        for (int i = 0; i < n; i++) {
            result[i] = temp;
            temp *= nums[i];
        }

        temp = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= temp;
            temp *= nums[i];
        }

        return result;
    }
}
