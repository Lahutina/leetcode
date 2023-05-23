/*
https://leetcode.com/problems/concatenation-of-array/description/
 */

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] newArray = new int[length * 2];

        for (int i = 0, j = length; i < length; i++, j++) {
            newArray[i] = nums[i];
            newArray[j] = nums[i];
        }
        return newArray;
    }
}
