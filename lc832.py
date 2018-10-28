class Solution:
    def flipAndInvertImage(self, A):
        """
        :type A: List[List[int]]
        :rtype: List[List[int]]
        """
        #flip the list
        l = len(A)
        for i in range(0, l):
            A[i].reverse()
        
        #invert 1 to 0, 0 to 1
        ll = len(A[0])
        for i in range(0, l):
            for j in range(0, ll):
                A[i][j] = 1 - A[i][j]
        return A