import java.util.Arrays;

class Solution {
  public int partitionArray(int[] nums, int k) {
    if (nums == null || nums.length == 0) return 0;

    Arrays.sort(nums);
    int count = 1;
    int start = nums[0];

    for (int i = 1, n = nums.length; i < n; i++) {
      if (nums[i] - start > k) {
        count++;
        start = nums[i];
      }
    }

    return count;  }
}
