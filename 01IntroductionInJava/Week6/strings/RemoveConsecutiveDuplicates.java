/*
Problem statement
For a given string(str), remove all the consecutive duplicate characters.

Example:
Input String: "aaaa"
Expected Output: "a"

Input String: "aabbbcc"
Expected Output: "abc"
 Input Format:
The first and only line of input contains a string without any leading and trailing spaces. All the characters in the string would be in lower case.
Output Format:
The only line of output prints the updated string.
Note:
You are not required to print anything. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
aabccbaa
Sample Output 1:
abcba
Sample Input 2:
xxyyzxx
Sample Output 2:
xyzx
*/


// Approach 1
public class RemoveConsecutiveDuplicates {
    public static String removeConsecutiveDuplicates(String str) {
		// string with length 0 or 1 has all unique characters
		if(str.length() <= 1)
			return str;
		
		String result = Character.toString(str.charAt(0));
        
		for(int i=1;i<str.length();i++){
			if(str.charAt(i) != str.charAt(i-1))
				result += str.charAt(i);
		}

		return result;
		
	}
}

// Approach 2
class RemoveConsecutiveDuplicates2 {
    public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
		String result = "";
		char ch = '\0';
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) != ch){
				ch = str.charAt(i);
				result += ch;
			}
		}

		return result;
	}
}