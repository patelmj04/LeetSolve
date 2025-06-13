class Solution {
  public int minimizeMax(int[] nums, int p) {
    Arrays.sort(nums);
    int l = 0, r = nums[nums.length - 1] - nums[0];

    while (l < r) {
      int m = (l + r) / 2;
      if (countPairs(nums, m) >= p)
        r = m;
      else
        l = m + 1;
    }

    return l;
  }

  private int countPairs(int[] nums, int maxDiff) {
    int pairs = 0;
    for (int i = 1; i < nums.length; ++i) {
      if (nums[i] - nums[i - 1] <= maxDiff) {
        ++pairs;
        ++i;
      }
    }
    return pairs;
  }
}
