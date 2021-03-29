class Solution {
    public boolean isPalindrome(int x) {
        char[] charArr = Integer.toString(x).toCharArray();

        int len = charArr.length;
        for (int i = 0; i < len / 2; i++) {
            if (charArr[i] != charArr[len - 1 - i]) return false;
        }

        return true;
    }
}