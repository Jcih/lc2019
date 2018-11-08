class Solution:
    def numJewelsInStones(self, J, S):
        """
        :type J: str
        :type S: str
        :rtype: int
        """
        #convert to list will be much faster than use in S directly
        listS = [x for x in S]
        listJ = [y for y in J]
        count = 0
        for i in listS:
            if i in listJ:
                count += 1
        return count