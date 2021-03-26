class Solution {
  public int lengthOfLongestSubstring(String s) {
    if (s.length() <= 1) {
      return s.length();
    }

    int max = 0, j = 0;
    for (int i = 1; i < s.length(); i++) {
      char c1 = s.charAt(i);
      for (int k = j; k < i; k++) {
        char c2 = s.charAt(k);
        if (c1 == c2) {
          j = k + 1;
          break;
        }
      }

      int currMax = i - j;
      if (currMax > max) max = currMax;
    }

    return max + 1;
  }
}