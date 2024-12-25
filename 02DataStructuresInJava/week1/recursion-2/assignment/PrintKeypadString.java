/*
Problem statement
Given an integer n, using phone keypad find out and print all the possible strings that can be made using digits of input n.

Note :
The order of strings are not important. Just print different strings in new lines.
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
public class PrintKeypadString {
    public static void printKeypad(int input){
		// Write your code here
		if(input == 0 || input ==1)
			return;

		String output = "";

		printKeys(input, output);
	}

	public static void printKeys(int input, String output){
		if(input == 0){
			System.out.println(output);
		}

		int digit = input%10;
		String alphabets = keypadHelper(digit);
		
		for(char ch: alphabets.toCharArray()){
			printKeys(input/10, ch+output);
		}
	}


	public static String keypadHelper(int n){
		switch(n){
			case 2:
				return "abc";
			case 3:
				return "def";
			case 4:
				return "ghi";
			case 5:
				return "jkl";
			case 6:
				return "mno";
			case 7:
				return "pqrs";
			case 8:
				return "tuv";
			case 9:
				return "wxyz";
		}

		return "";
	}
}
