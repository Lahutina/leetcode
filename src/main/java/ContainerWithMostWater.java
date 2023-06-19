/*
https://leetcode.com/problems/container-with-most-water/description/
 */

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i = 0, n = height.length - 1;
        int maxArea = 0;

        while (i < n) {
            int width = n - i;
            int currArea = height[i] < height[n] ? width * height[i] : width * height[n];

            if (currArea > maxArea) {
                maxArea = currArea;
            }

            if (height[i] < height[n]) {
                i++;
            } else {
                n--;
            }
        }
        return maxArea;
    }
}
