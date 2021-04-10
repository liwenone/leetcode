class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.equals("")) return 0;

        int len1 = haystack.length();
        int len2 = needle.length();

        for (int i = 0; i < len1 - len2; i++) {
            for (int j = 0; j < len2; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) break;
                if (j == len2 - 1) return i;
            }
        }

        return -1;
    }
}