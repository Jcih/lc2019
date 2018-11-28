class Solution:
    def reverseString(self, s):
        """
        :type s: str
        :rtype: str
       
        Solution 1
        b = list(s)
        b.reverse()
        return ''.join(b)
        """
        
        return s[::-1]
    