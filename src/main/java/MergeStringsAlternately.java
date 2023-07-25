/*
https://leetcode.com/problems/merge-strings-alternately/submissions/?envType=study-plan-v2&envId=leetcode-75
 */
public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;

        while (i < word1.length() && i < word2.length()) {
            stringBuilder.append(word1.charAt(i)).append(word2.charAt(i++));
        }

        stringBuilder.append(word1.substring(i)).append(word2.substring(i));

        return stringBuilder.toString();
    }
}
