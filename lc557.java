//Solution I
class Solution {
    public String reverseWords(String s) {
        String[] array_s = s.split("\\s");
        String result = "";
        for (String word: array_s) {
            String rev_word = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                rev_word += word.charAt(i);
            }
            result += rev_word + " ";
        }
        return result.trim();
    }
}

//SolutionII
class Solution {
    public String reverseWords(String s) {
        String[] a = s.split(" ");
        StringBuilder sc = new StringBuilder();
        for(int i=0;i<a.length;i++){
            StringBuilder sb = new StringBuilder(a[i]);
            sb.reverse();
            if(i!=a.length-1)
                sc.append(sb.toString()+ " ");
            else
                sc.append(sb.toString());
        }
        return sc.toString();
    }
}