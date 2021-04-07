class Solution {
  public int maxArea(int[] height) {
    int max = 0;
    int left = 0;
    int right = height.length - 1;

    int lh = 0, rh = 0;

    while (left < right) {
      lh = height[left];
      rh = height[right];

      int s = Math.min(lh, rh) * (right - left);
      if (s > max) max = s;

      if (lh < rh) {
        left++;
      } else {
        right--;
      }
    }

    return max;
  }
}
