/*
https://leetcode.com/problems/top-k-frequent-elements/
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        return Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(k).mapToInt(Map.Entry::getKey).toArray();
    }
}
