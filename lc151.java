//Solution I.   remember to use trim()
class Solution {
    public String reverseWords(String s) {
        String[] splited = s.trim().split("\\s+");
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = splited.length - 1; i >= 0; i--) {
            sb.append(splited[i]);
            
            if (i > 0) {
                sb.append(" ");
            }
            
        }
        
        return sb.toString();
    }
}



//Solution II.  split(" ") is much faster than split("\\s"), if multiple spaces, try to use isEmpty() to avoid regular expression.
class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i].isEmpty())
                continue;
            
            sb.append(arr[i]);
            if(i > 0)
                sb.append(" ");
        }
        return sb.toString();
    }
}