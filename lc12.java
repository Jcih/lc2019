/**
*    I  1
     V  5
     X  10
     L  50
     C  100
     D  500
     M  1000
*/


class Solution {
	public String intToRoman(int num) {
		String[] M = new String[]{"", "M", "MM", "MMM"}; // , 1000, 2000, 3000
		String[] C = new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}; // , 100, 200, 300, 400, 500, 600, 700, 800, 900
		String[] X = new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"}; // , 10, 20, 30, 40, 50, 60, 70, 80, 90
		String[] I = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}; // , 1, 2, 3, 4, 5, 6, 7, 8, 9

		return M[num/1000] + C[(num % 1000) / 100] + X[(num % 100) / 10] + I[num % 10];
	}
}