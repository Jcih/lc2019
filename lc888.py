class Solution:
    def fairCandySwap(self, A, B):
        """
        :type A: List[int]
        :type B: List[int]
        :rtype: List[int]

         """  
        #if not declare first, time limit will exceed
        sum_A, sum_B, set_B = sum(A), sum(B), set(B)
       
        average = (sum_A + sum_B)//2
        
        # sum_A -x + y = average, so y = average - sum_A + x 
        for x in A:
            y = average - sum_A + x 
            if y in set_B:
                return [x, y] 