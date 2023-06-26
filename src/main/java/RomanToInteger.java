/*
https://leetcode.com/problems/roman-to-integer/description/?envType=study-plan-v2&envId=top-interview-150Q
 */

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> romanChars = new HashMap<>();
        romanChars.put('I', 1);
        romanChars.put('V', 5);
        romanChars.put('X', 10);
        romanChars.put('L', 50);
        romanChars.put('C', 100);
        romanChars.put('D', 500);
        romanChars.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int value = romanChars.get(s.charAt(i));
            if (i < s.length() - 1 && value < romanChars.get(s.charAt(i + 1))) {
                result -= value;
            } else {
                result += value;
            }
        }

        return result;
    }
}
