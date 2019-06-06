//https://github.com/YaokaiYang-assaultmaster/LeetCode/blob/master/LeetcodeAlgorithmQuestions/299.%20Bulls%20and%20Cows.md
class Solution {
    public String getHint(String secret, String guess) {
        char[] arr1 = secret.toCharArray();
        char[] arr2 = guess.toCharArray();
        int[] nums = new int[10];
        
        int bull = 0;
        int cow = 0;
        
        for (int i = 0; i < arr1.length; i++) {
            int s = arr1[i] - '0';
            int g = arr2[i] - '0';
            
            if (s == g) {
                bull++;
            }else {
                if (nums[s] < 0) cow++;
                if (nums[g] > 0) cow++;
                nums[s]++;
                nums[g]--;
                
            }
        }
        return bull + "A" + cow + "B";
    }
}