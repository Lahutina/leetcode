/*
https://leetcode.com/problems/longest-consecutive-sequence/?envType=study-plan-v2&envId=top-interview-150
 */
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> sequence = new HashSet<>();
        for (int num : nums) {
            sequence.add(num);
        }

        int result = 0;
        for (int num : nums) {
            if (!sequence.contains(num - 1)) {
                int currLen = 1;
                while (sequence.contains(++num)) {
                    currLen++;
                }
                result = Math.max(currLen, result);
            }
        }

        return result;
    }
}
