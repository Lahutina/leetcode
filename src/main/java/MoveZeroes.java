/*
https://leetcode.com/problems/move-zeroes/description/?envType=study-plan-v2&envId=leetcode-75
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int ilastDigit = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[ilastDigit];
                nums[ilastDigit] = temp;
                ilastDigit++;
            }
        }
    }
}
