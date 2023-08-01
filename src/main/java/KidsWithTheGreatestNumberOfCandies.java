/*
https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75
*/

import java.util.LinkedList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> result = new LinkedList<>();

        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        for (int i = 0; i < candies.length; i++) {
            result.add(i, candies[i] + extraCandies >= max);
        }

        return result;
    }
}
