class Solution {
    public boolean judgeCircle(String moves) {
        int countV = 0;
        int countH = 0;
        
        for (char c: moves.toCharArray()) {
            switch(c) {
                case 'U':
                    countV++;
                    break;
                case 'D':
                    countV--;
                    break;
                case 'L':
                    countH++;
                    break;
                case 'R':
                    countH--;
                    break;
            }
        }
        return countV == 0 && countH == 0;
    }
}