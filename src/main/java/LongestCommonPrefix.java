/*
https://leetcode.com/problems/longest-common-prefix/description/?envType=study-plan-v2&envId=top-interview-150
 */
import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        return Arrays.stream(strs)
                .reduce((prefix, str) -> {
                    while (!str.startsWith(prefix)) {
                        prefix = prefix.substring(0, prefix.length() - 1);
                        if (prefix.isEmpty()) {
                            return "";
                        }
                    }
                    return prefix;
                })
                .orElse("");
    }
}
