/*
Problem statement
Given two string s and t, write a function to check if s contains all characters of t (in the same order as they are in string t).

Return true or false.

Do it recursively.

E.g. : s = “abchjsgsuohhdhyrikkknddg” contains all characters of t=”coding” in the same order. So function will return true.

Detailed explanation ( Input/output format, Notes, Images )
Input Format :
Line 1 : String s
Line 2 : String t
Output Format :
true or false
Sample Input 1 :
abchjsgsuohhdhyrikkknddg
coding
Sample Output 1 :
true
Sample Input 2 :
abcde
aeb
Sample Output 2 :
false
*/

public class ContainsSubStringCharsInSameOrder {
    public static boolean checkSequence(String a, String b) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		 if(b.equals(""))
		 return true;
		 if(a.equals(""))
		 return false;

		 boolean ans;
		 if(a.charAt(0) == b.charAt(0)){
			 ans =  checkSequence(a.substring(1), b.substring(1));
		 }else{
			 ans = checkSequence(a.substring(1), b);
		 }

		 return ans;

	}
}
