public class PlusOne {
    public int[] plusOne(int[] digits) {
        int numRes = 0;
        for (int num : digits) {
            numRes = numRes * 10 + num;
        }
        numRes++;

        int resultLen = digits[digits.length - 1] == 9 ? digits.length + 1 : digits.length;

        int[] resultArr = new int[resultLen];
        for (int i = resultLen - 1; i >= 0; i--) {
            resultArr[i] = numRes % 10;
            numRes /= 10;
        }
        return resultArr;
    }
}