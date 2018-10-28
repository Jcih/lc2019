class Solution:
    def isToeplitzMatrix(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: bool
        """
        m = len(matrix)
        n = len(matrix[0])
        if m == 1 or n == 1:
            return True
        
        for i in range(m-1):
            for j in range(n-1):
                if matrix[i + 1][j + 1] == matrix[i][j]:
                    flag = True
                else: 
                    return False
                    break
        return flag