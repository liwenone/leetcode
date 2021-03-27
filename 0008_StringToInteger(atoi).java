class Solution {
    public int myAtoi(String s) {
        char[] charArr = s.trim().toCharArray();
        if (charArr.length == 0) return 0;

        int sign = charArr[0] == '-' ? -1 : 1;
        int startIndex = charArr[0] == '-' || charArr[0] == '+' ? 1 : 0;

        int res = 0;
        for (int i = startIndex; i < charArr.length; i++) {
            char c = charArr[i];

            if (c < '0' || c > '9') break;

            int n = (c - '0') * sign;
            if (sign < 0) {
                if (res < Integer.MIN_VALUE / 10 || res == Integer.MIN_VALUE / 10 && n < -8) {
                    res = Integer.MIN_VALUE;
                    break;
                }
            }
            if (sign > 0) {
                if (res > Integer.MAX_VALUE / 10 || res == Integer.MAX_VALUE / 10 && n > 7) {
                    res = Integer.MAX_VALUE;
                    break;
                }
            }

            res = res * 10 + n;
        }

        return res;
    }
}