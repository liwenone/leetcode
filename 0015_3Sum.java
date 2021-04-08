import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        int len = nums.length;
        List<List<Integer>> resultList = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) return resultList;
            if (i > 0 && nums[i - 1] == nums[i]) continue;

            int left = i + 1;
            int right = len - 1;

            while (left < right) {
                int tmp = nums[i] + nums[left] + nums[right];
                if (tmp == 0) {
                    List<Integer> tmpList = new ArrayList<>();
                    tmpList.add(nums[i]);
                    tmpList.add(nums[left]);
                    tmpList.add(nums[right]);
                    resultList.add(tmpList);

                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;

                } else if (tmp < 0) {
                    left++;
                } else if (tmp > 0) {
                    right--;
                }
            }
        }

        return resultList;
    }
}
