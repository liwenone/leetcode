class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || x % 10 == 0 && x != 0) return false;

        if (x < 10) return true;

        int tmp = x;
        int ans = 0;
        int count = 1;
        while (x / 10 != 0) {
            ans = ans * 10 + (x % 10);
            x /= 10;
            count *= 10;
        }

        return ans == tmp / 10 &&  ans / (count / 10) == x;
    }
}