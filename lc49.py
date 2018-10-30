class Solution:
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        d={}
        for s in strs:
            srt=''.join(sorted(s))
            if srt in d:
                d[srt].append(s)
            else:
                d[srt]=[s]
        ret_list=[]
        for k in d.keys():
            ret_list.append(d[k])
        return ret_list