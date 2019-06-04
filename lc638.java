class Solution {
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        int result = Integer.MAX_VALUE;
        
        for (int i = 0; i < special.size(); i++) {
            List<Integer> offer = special.get(i);
            boolean valid = true;
            
            for (int j = 0; j < needs.size(); j++) {
                int remain = needs.get(j) - offer.get(j);
                
                needs.set(j,remain);
                if (valid && remain < 0) {
                    valid = false;
                }
            }
            if (valid) {
                result = Math.min(result, shoppingOffers(price, special, needs)+offer.get(needs.size()));}
            for (int j = 0; j<needs.size(); j++) {
                int origin = needs.get(j) + offer.get(j);
                needs.set(j, origin);
            }
                
        }
        
        int nonOffer = 0;
        for (int i = 0; i < needs.size(); i++) {
            nonOffer += price.get(i) * needs.get(i);
        }
        return Math.min(result, nonOffer);
    }
}