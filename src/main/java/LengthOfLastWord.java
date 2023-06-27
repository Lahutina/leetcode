/*
https://leetcode.com/problems/length-of-last-word/?envType=study-plan-v2&envId=top-interview-150
 */

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String trimmedS = s.trim();
        return trimmedS.substring(trimmedS.lastIndexOf(' ') + 1).length();
    }
}
