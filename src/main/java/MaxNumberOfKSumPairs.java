import java.util.Arrays;

public class MaxNumberOfKSumPairs {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int pairs = 0;
        int first = 0;
        int last = nums.length - 1;

        while (first < last) {
            int sum = nums[first] + nums[last];
            if (sum == k) {
                pairs++;
                first++;
                last--;
            } else if (sum < k) {
                first++;
            } else {
                last--;
            }
        }

        return pairs;
    }
}
