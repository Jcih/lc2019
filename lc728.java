class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> ans = new ArrayList<>();
        
        for (long i = left; i <= right; i++) {
            long temp = i;
            while(temp != 0) {
                long divide = temp % 10; //  128 % 10 = 8
                if (divide == 0 || i % divide != 0) {
                    break;
                }
                temp /= 10; //. 128 / 10 = 12
            }
            if (temp == 0) {
                ans.add((int)i);
            }
        }
        return ans;
    }
}