import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int[] arr = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] strArr = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

        for (int i = 0; i < arr.length; i++) {
            map.put(strArr[i], arr[i]);
        }

        int len = s.length();
        int ans = 0, i = 0;
        String s1 = "", s2 = "";

        while (i < len) {
            s1 = s.substring(i, i + 1);
            s2 = i + 2 <= len ? s.substring(i, i + 2) : "";

            Integer n = map.get(s2);
            if (n != null) {
                ans += n;
                i = i + 2;
            } else {
                ans += map.get(s1);
                i = i + 1;
            }
        }

        return ans;
    }
}