/*
Problem statement
For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.

Permutations of each other
Two strings are said to be a permutation of each other when either of the string's characters can be rearranged so that it becomes identical to the other one.

Example: 
str1= "sinrtg" 
str2 = "string"

The character of the first string(str1) can be rearranged to form str2 and hence we can say that the given strings are a permutation of each other.
Detailed explanation ( Input/output format, Notes, Images )
Input Format:
The first line of input contains a string without any leading and trailing spaces, representing the first string 'str1'.

The second line of input contains a string without any leading and trailing spaces, representing the second string 'str2'.
Note:
All the characters in the input strings would be in lower case.
Output Format:
The only line of output prints either 'true' or 'false', denoting whether the two strings are a permutation of each other or not.

You are not required to print anything. It has already been taken care of. Just implement the function. 
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
abcde
baedc
Sample Output 1:
true
Sample Input 2:
abc
cbd
Sample Output 2:
false
*/

public class CheckPermutation {
    public static boolean isPermutation(String str1, String str2) {
		if(str1.length() != str2.length())
			return false;


		int[] charFrequency = new int[26];

		for(int i=0; i<str1.length(); i++){
			charFrequency[str1.charAt(i) - 'a']++;
			charFrequency[str2.charAt(i) - 'a']--;
		}

		for(int freq: charFrequency){
			if( freq != 0)
				return false;
		}

		return true;
	}
}
