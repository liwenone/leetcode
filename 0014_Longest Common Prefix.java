class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        int len = strs[0].length();
        int i = 0, j = strs.length;
        char c;
        while (i < len && j == strs.length) {
            c = strs[0].charAt(i);

            j = 0;
            while (j < strs.length && i < strs[j].length() && strs[j].charAt(i) == c) j++;

            if (j == strs.length) i++;
        }

        return strs[0].substring(0, i);
    }
}