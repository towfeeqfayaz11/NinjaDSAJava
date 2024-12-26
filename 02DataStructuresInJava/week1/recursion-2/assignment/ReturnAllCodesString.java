/*
Problem statement
Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S. Write a program to return the list of all possible codes that can be generated from the given string.

Note : The order of codes are not important. And input string does not contain 0s.
Detailed explanation ( Input/output format, Notes, Images )
Input format :
A numeric string
Constraints :
1 <= Length of String S <= 10

Sample Input:
1123
Sample Output:
aabc
kbc
alc
aaw
kw
*/

public class ReturnAllCodesString {
    // Return a string array that contains all possible codes
	public static  String[] getCode(String input){
		// Write your code here
		
		//basecase
		if(input.length() == 0){
			return new String[]{""};
			// String[] ans = {""};
			// return ans;
		}

		//case1
		// considering only 1 digit
		int digit1 = input.charAt(0) - '0';
		char ch1 = (char)(digit1 + 'a' -1);
		
		String[] smallOutput1 = getCode(input.substring(1));
		for(int i=0; i<smallOutput1.length; i++){
			smallOutput1[i] = ch1 + smallOutput1[i];
		}

		//case2
		// considering two digits
		String[] smallOutput2 = new String[0];
		if(input.length() > 1){
			int digit2 = input.charAt(1) - '0';
			char ch2 = (char)((digit1*10+ digit2) + 'a' -1);
			if(ch2 >= 'a' && ch2 <= 'z'){
				smallOutput2 = getCode(input.substring(2));
				for(int i=0; i<smallOutput2.length; i++){
					smallOutput2[i] = ch2 + smallOutput2[i];
				}
			}
		}

		// prepare final output
		String[] output = new String[smallOutput1.length + smallOutput2.length];
		int k =0;
		for(int i=0;i<smallOutput1.length; i++){
			output[k++] = smallOutput1[i];
		}
		for(int j=0;j<smallOutput2.length; j++){
			output[k++] = smallOutput2[j];
		}

		return output;
	}
}
