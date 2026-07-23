/*
https://leetcode.com/problems/product-of-array-except-self/
 */

class ProductOfArrayExceptSelf2 {
    // 1 1 2 6
    // 24 12 8 6

    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        int multplLeft = 1;
        for (int i = 0; i < nums.length; i++) {
            answer[i] = multplLeft;
            multplLeft *= nums[i];
        }

        int multplRight = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] = answer[i] * multplRight;
            multplRight *= nums[i];
        }

        return answer;
    }
}