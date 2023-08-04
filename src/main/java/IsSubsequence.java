/*
https://leetcode.com/problems/is-subsequence/description/?envType=study-plan-v2&envId=leetcode-75
 */

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }

        int iS = 0;

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(iS)) {
                iS++;
                if (iS >= s.length()) {
                    break;
                }
            }
        }

        return iS == s.length();
    }
}
