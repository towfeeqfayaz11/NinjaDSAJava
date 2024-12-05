/*
Problem statement
For a given a string(str), find and return the highest occurring character.

Example:
Input String: "abcdeapapqarr"
Expected Output: 'a'
Since 'a' has appeared four times in the string which happens to be the highest frequency character, the answer would be 'a'.
If there are two characters in the input string with the same frequency, return the character which comes first.

Consider:
Assume all the characters in the given string to be in lowercase always.
Detailed explanation ( Input/output format, Notes, Images )
Input Format:
The first and only line of input contains a string without any leading and trailing spaces.
Output Format:
The only line of output prints the updated string. 
Note:
You are not required to print anything explicitly. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
abdefgbabfba
Sample Output 1:
b
Sample Input 2:
xy
Sample Output 2:
x
*/
public class HeighestOccuringCharacter {

    // most of problems related to characters can be solved using character array with frequencies
    public static char highestOccuringChar(String str) {
		//create array to store count of each character
		int[] charCounts = new int[26];

		int max=0;
		char ch = '\0';

		for(int i=0;i<str.length();i++){
			int index = str.charAt(i) - 'a';
			charCounts[index]++;

			// if count of current character is greater than max, update max
			if(charCounts[index] > max)
			    max = charCounts[index];
		}

        // if we need to return any character with highest frequency, then this loop is not required
        // but if we have multiple characters with same high frequency, then this loop is required to return the
        // first character which comes first in the string
		for(int i=0;i<str.length();i++){      
			int index = str.charAt(i) - 'a';
			if(max == charCounts[index]){
			    ch = str.charAt(i);
                break;
            }
		}

		return ch;

	}
}
