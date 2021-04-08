import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
  
        int len = nums.length;
        int closest = 10000;
  
        for (int i = 0; i < len; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = len - 1;
  
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
  
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }
  
                if (sum > target) {
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    return closest;
                }
            }
        }
  
        return closest;
    }
  }
  