/*
Problem statement
Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 with character c2 in the given string.

Do this recursively.

Detailed explanation ( Input/output format, Notes, Images )
Input Format :
Line 1 : Input String S
Line 2 : Character c1 and c2 (separated by space)
Output Format :
Updated string
Constraints :
1 <= Length of String S <= 10^6

Sample Input :
abacd
a x
Sample Output :
xbxcd
*/

public class ReplaceCharacterRecursively {
    public static String replaceCharacter(String input, char c1, char c2) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		 if(input.length() == 0)
		 	return input;

		 String smallOutput = replaceCharacter(input.substring(1), c1, c2);
		 char ch = input.charAt(0);
		 if(ch == c1)
		 	return c2 + smallOutput;
		 else
		 	return ch + smallOutput;
	}
}
