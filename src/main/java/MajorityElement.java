/*
https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0;
        int majority = 0;

        for (int num : nums) {
            if (count == 0) {
                majority = num;
            }
            count += num == majority ? 1 : -1;
        }

        return majority;
    }
}
