class Solution {
    private int centerSpread(char[] charArr, int L, int R) {
        while (L >= 0 && R < charArr.length && charArr[L] == charArr[R]) {
            L--;
            R++;
        }

        return R - L - 1;
    }

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        
        char[] charArr = s.toCharArray();
        int maxLen = 0, startIndex = 0;
        for (int i = 0; i < charArr.length; i++) {
            int len1 = this.centerSpread(charArr, i, i);
            int len2 = this.centerSpread(charArr, i, i + 1);

            int len = Math.max(len1, len2);
            if (len > maxLen) {
                startIndex = i - len / 2 + (len % 2 == 0 ? 1 : 0);
                maxLen = len;
            }
        }

        return s.substring(startIndex, startIndex + maxLen);
    }
}