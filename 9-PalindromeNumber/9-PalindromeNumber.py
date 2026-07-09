# Last updated: 7/9/2026, 10:08:46 AM
class Solution(object):
    def isPalindrome(self, x):
        return str(x) == str(x)[::-1]
        