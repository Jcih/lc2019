//Solution I
class Solution {
	public String longestPalindrome(String s) {
	if (s == null || s.length() <= 1)
		return s;

	int n = s.length();
	char[] cs = s.toCharArray();
	int max = 1;
	int maxIndex = 0;

	boolean dp[][] = new boolean[n][n];

	for (int i = 0; i < n; i++) {
		dp[i][i] = true;
		maxIndex = i;
	} 

	for (int i = 0; i < n - 1; i++) {
		if (cs[i] == cs[i + 1]) {
			dp[i][i+1] = true;
			max = 2;
			maxIndex = i;
		}
	}

	for (int len = 3; len <= n; len++) {
		for (int i = 0; i < n - len + 1; i++) {
			int j = i + len -1;

			if (cs[i] == cs[j] && dp[i+1][j-1]) {
				max = len;

				maxIndex = i;
				dp[i][j] = true;
			}
		}
	}
	return s.substring(maxIndex, maxIndex + max);
}

}


//Solution II, faster
class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++){
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i+1);
            int len = Math.max(len1, len2);
            if (len > end - start){
                start = i - (len - 1)/2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end+1);
    }
    
     private int expandAroundCenter(String s, int left, int right){
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)){
            L--;
            R++;
        }
        return R-L-1;
    }
}