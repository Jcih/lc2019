class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> res= new HashSet<>(); 
        for (String email: emails) {
            String[] first_split = email.split("@");
            String[] local_part = first_split[0].split("\\+");
            res.add(local_part[0].replace(".", "") + "@" + first_split[1]);
            
        }
        return res.size();
    }
}