/*
https://leetcode.com/problems/add-binary/
 */

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int ai = a.length() - 1;
        int bi = b.length() - 1;
        int temp = 0;

        while (ai >= 0 || bi >= 0 || temp != 0) {
            if (ai >= 0) {
                temp += a.charAt(ai--) - '0';
            }

            if (bi >= 0) {
                temp += b.charAt(bi--) - '0';
            }

            result.append(temp % 2);
            temp = temp / 2;
        }

        return result.reverse().toString();
    }
}
