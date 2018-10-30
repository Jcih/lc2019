class Solution:
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        # Solution 1: return sorted(s) == sorted(t)
        
        for i in set(s + t):
            if s.count(i) != t.count(i):
                return False
        return True