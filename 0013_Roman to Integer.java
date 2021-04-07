
class Solution {
    public int getValue(char c) {
        switch(c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public int romanToInt(String s) {
        int prev = getValue(s.charAt(0)), curr = 0;
        int ans = prev;

        for (int i = 1; i < s.length(); i++) {
            curr = getValue(s.charAt(i));

            if (prev < curr) {
                ans += curr - 2 * prev;
            } else {
                ans += curr;
            }

            prev = curr;
        }

        return ans;
    }
}