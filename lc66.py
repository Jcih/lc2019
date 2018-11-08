class Solution:
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        str1 = ''.join(str(e) for e in digits)
        num = int(str1) + 1
        
        res = [int(x) for x in str(num)]
        return res
        