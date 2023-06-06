/*
https://leetcode.com/problems/valid-anagram/
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        List<Character> sChars = new ArrayList<>();
        for (Character c : s.toCharArray()) {
            sChars.add(c);
        }
        for (Character c : t.toCharArray()) {
            if (sChars.contains(c)) {
                sChars.remove(c);
            } else return false;
        }
        return sChars.isEmpty();
    }

    public boolean isAnagram2(String s, String t) {

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }
}