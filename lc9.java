//Solution I, slow.
class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        if (new StringBuilder(s).reverse().toString().equals(s)) {
            return true;
        } else {
            return false;
        }
    }
}