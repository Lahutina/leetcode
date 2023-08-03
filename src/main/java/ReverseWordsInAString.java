/*
https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=leetcode-75
 */

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        int n = words.length - 1;
        for (int i = 0; i < n; i++, n--) {
            String temp = words[i];
            words[i] = words[n];
            words[n] = temp;
        }

        return String.join(" ", words);
    }
}
