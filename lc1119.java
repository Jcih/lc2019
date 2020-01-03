class Solution {
	public String removeVowels(String S) {
		StringBuilder sb = new StringBuilder();
		Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));


		//using String.toCharArray to iterate an String.
		for (char c : S.toCharArray()) {
			if (vowels.contains(c)) continue;
			sb.append(c);
		}
		return sb.toString();
	}
}



//Solution II
public String removeVowels(String s) {

	return S.replaceAll("[aeiou]","");
}