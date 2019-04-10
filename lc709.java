class Solution {
    public String toLowerCase(String str) {
        char[] str_array = str.toCharArray();
        for (int i = 0; i < str_array.length; i++) {
            if (str_array[i] >= 'A' && str_array[i] <= 'Z') {
                str_array[i] += 32;
            }
            
        }
        return new String(str_array);
    }
}