class Solution:
    def maxSumOfSquares(self, num, sum): return '' if sum > 9 * num else ('9' * (sum // 9) + (str(sum % 9) if sum % 9 else '')).ljust(num, '0')