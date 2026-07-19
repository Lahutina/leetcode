/*
https://leetcode.com/problems/happy-number/description/?envType=study-plan-v2&envId=top-interview-150
 */

public class HappyNumber {
    public boolean isHappy(int n) {
        int threshold = 10;

        return sqrSum(n, threshold) == 1;
    }

    public int sqrSum(int n, int threshold) {
        int sum = 0;

        while (n != 0) {
            sum += (n % 10) * (n % 10);
            n = n / 10;
        }

        if (threshold != 0) {
            return sqrSum(sum, threshold - 1);
        } else  {
            return sum;
        }
    }
}
