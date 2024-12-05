/*
Problem statement
Aadil has been provided with a sentence in the form of a string as a function parameter. The task is to implement a function so as to change the sentence such that each word in the sentence is reversed. A word is a combination of characters without any spaces.

Example:
Input Sentence: "Hello I am Aadil"
The expected output will look, "olleH I ma lidaA".
Detailed explanation ( Input/output format, Notes, Images )
Input Format:
The first and only line of input contains a string without any leading and trailing spaces. The input string represents the sentence given to Aadil.
Output Format:
You don't need to print anything just change the sentence(string) such that each word in the sentence is reversed. 
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

All the words in string are separated by a single space.

String does not contain any leading or trailing spaces.

Time Limit: 1 second
Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
emocleW ot gnidoC sajniN
Sample Input 2:
Always indent your code
Sample Output 2:
syawlA tnedni ruoy edoc
*/
public class ReverseEachWordOfString {
	public static String reverseEachWord(String str) {
		String[] strArr = str.split(" ");

		String result = "";
		for(int i=0; i<strArr.length; i++){
			String revWord = reverseWord(strArr[i]);
			result+=revWord;

			if(i != strArr.length-1)
				result+=" ";
		}

		return result;
	}

	public static String reverseWord(String str){
		String revStr = "";
		for(int i=0; i<str.length(); i++){
			revStr = str.charAt(i) + revStr;
		}

		return revStr;
	}
}
