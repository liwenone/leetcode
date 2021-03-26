class Solution {
  public int lengthOfLongestSubstring(String s) {
    if (s.length() == 0) return 0;

    int max = 0;
    for (int i = 0; i < s.length() - 1; i++) {
      for (int j = i + 1; j < s.length(); j++) {
        String prefix = s.substring(i, j);
        String curr = s.substring(j, j + 1);
        if (prefix.contains(curr)) break;

        int currMax = j - i;
        if (currMax > max) max = currMax;
      }
    }

    return max + 1;
  }
}
