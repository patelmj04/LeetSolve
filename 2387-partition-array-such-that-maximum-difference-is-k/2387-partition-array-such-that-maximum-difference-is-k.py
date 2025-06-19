from typing import List

class Solution:
    def partitionArray(self, nums: List[int], k: int) -> int:
        if not nums:
            return 0

        nums.sort()
        count = 1
        start = nums[0]

        for num in nums[1:]:
            if num - start > k:
                count += 1
                start = num

        return count
