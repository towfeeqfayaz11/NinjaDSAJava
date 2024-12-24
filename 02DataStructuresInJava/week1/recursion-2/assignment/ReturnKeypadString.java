/*
Problem statement
Given an integer n, using phone keypad find out all the possible strings that can be made using digits of input n.
Return empty string for numbers 0 and 1.
Note :
1. The order of strings are not important.
2. Input and output has already been managed for you. You just have to populate the output array and return the count of elements populated in the output array.
Detailed explanation ( Input/output format, Notes, Images )
Input Format :
Integer n
Output Format :
All possible strings in different lines
Constraints :
1 <= n <= 10^6

Sample Input:
23
Sample Output:
ad
ae
af
bd
be
bf
cd
ce
cf
*/

public class ReturnKeypadString {
    public static String[] keypad(int n){
		if( n==0 || n==1) {
			return new String[]{""};
            
            // String[] ans = {""};
			// return ans;
        }
		
		String[] smallOutput = keypad(n/10);

		int digit = n%10;
		String alphabets = keypadHelper(digit);

		String[] output = new String[smallOutput.length * alphabets.length()];
		
		int k=0;
		for(String ele: smallOutput){
			for(char ch: alphabets.toCharArray()){
				output[k++] = ele + ch;
			}
		}


		return output;
	}

	public static String keypadHelper(int digit){
		String output = "";

		switch(digit){
			case 2:
				output = "abc";
				break;
			case 3:
				output = "def";
				break;
			case 4:
				output = "ghi";
				break;
			case 5:
				output = "jkl";
				break;
			case 6:
				output = "mno";
				break;
			case 7:
				output = "pqrs";
				break;
			case 8:
				output = "tuv";
				break;
			case 9:
				output = "wxyz";
		}

		return output;
	}
}
