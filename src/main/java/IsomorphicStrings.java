/*
https://leetcode.com/problems/isomorphic-strings/description/?envType=study-plan-v2&envId=top-interview-150
*/

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Character> sMapping = new HashMap<>();
        Map<Character, Character> tMapping = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sMapping.getOrDefault(sChar, tChar) != tChar ||
                    tMapping.getOrDefault(tChar, sChar) != sChar) {
                return false;
            }

            sMapping.put(sChar, tChar);
            tMapping.put(tChar, sChar);
        }
        return true;
    }
}