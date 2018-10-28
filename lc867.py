class Solution:
    def transpose(self, A):
        """
        :type A: List[List[int]]
        :rtype: List[List[int]]
        """
        m = len(A)
        n = len(A[0])
        
        trans = [[None for i in range(m)] for j in range(n)]
        
        for i in range(n):
            for j in range(m):
                trans[i][j] = A[j][i]
                
        return trans
                