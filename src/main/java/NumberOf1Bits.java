/*
https://leetcode.com/problems/number-of-1-bits/?envType=study-plan-v2&envId=top-interview-150
 */

public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int sumOnes = 0;

        while (n != 0) {
            sumOnes += n % 2;

            n = n / 2;
        }

        return sumOnes;
    }
}
