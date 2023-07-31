/*
https://leetcode.com/problems/reverse-vowels-of-a-string/description/
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'));

        char[] charString = s.toCharArray();

        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            while (i < j && !vowels.contains(charString[i])) {
                i++;
            }

            while (i < j && !vowels.contains(charString[j])) {
                j--;
            }

            char temp = charString[i];
            charString[i] = charString[j];
            charString[j] = temp;
        }

        return new String(charString);
    }
}
