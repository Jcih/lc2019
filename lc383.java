//Solution I
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder sb = new StringBuilder(magazine);
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (sb.indexOf(c+"") == -1) {
                return false;
            }
            sb.deleteCharAt(sb.indexOf(c+""));
        }
        return true;
    }
}


//Solution II , faster than 100%
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] note = ransomNote.toCharArray();
        char[] zine = magazine.toCharArray();
        
        for(int i=0;i<note.length;i++)
        {
            boolean flag=false;
            for(int j=0;j<zine.length;j++)
            {
                if(note[i]==zine[j])
                {
                    zine[j]=' ';
                    flag=true;
                    break;
                }
            }
            
            if(flag==false)
            {
                return flag;
            }
            
        }
        
        return true;
    }
}