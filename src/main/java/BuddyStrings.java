/*
https://leetcode.com/problems/buddy-strings/submissions/
*/

import java.util.HashSet;
import java.util.Set;

public class BuddyStrings {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        if (s.equals(goal)) {
            Set<Character> temp = new HashSet<>();
            for (char c : s.toCharArray()) {
                if (!temp.add(c)) {
                    return true;
                }
            }
            return false;
        }

        int diffCharCount = 0;
        int i1 = -1;
        int i2 = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (++diffCharCount > 2) {
                    return false;
                }

                if (i1 == -1) {
                    i1 = i;
                } else {
                    i2 = i;
                }
            }
        }

        return diffCharCount == 2 && s.charAt(i1) == goal.charAt(i2) && s.charAt(i2) == goal.charAt(i1);
    }
}