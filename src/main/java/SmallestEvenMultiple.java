/*
https://leetcode.com/problems/smallest-even-multiple/
 */

class SmallestEvenMultiple {
    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) return n;

        for (int i = 2; true; i += 2) {
            if (n * 2 == i) return i;
        }
    }
}