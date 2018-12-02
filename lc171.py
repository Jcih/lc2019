class Solution(object):
    def titleToNumber(self, s):
        """
        :type s: str
        :rtype: int
        """
        LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        
        dct_temp = {}
        
        for i in range(26):
            dct_temp[LETTERS[i]] = i + 1
    
        res = 0
        for c in s:
            res = 26*res + dct_temp[c]
        return res