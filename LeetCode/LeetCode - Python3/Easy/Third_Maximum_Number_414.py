from ast import List


class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        unique = set(nums)
        if len(unique) < 3 :
            return max(unique)
        unique.remove(max(unique))
        unique.remove(max(unique))
        return max(unique)