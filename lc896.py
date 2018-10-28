class Solution:
    def isMonotonic(self, A):
        """
        :type A: List[int]
        :rtype: bool
        """
        a = sorted(A)
        b = a[::-1]
        return a == A or b == A