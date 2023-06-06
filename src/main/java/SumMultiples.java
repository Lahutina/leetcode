/*
https://leetcode.com/problems/sum-multiples/
 */

import java.util.stream.IntStream;

public class SumMultiples {
    public int sumOfMultiples(int n) {
        return IntStream.range(1, n + 1)
                .filter(num -> num % 3 == 0 || num % 5 == 0 || num % 7 == 0).sum();
    }
}
