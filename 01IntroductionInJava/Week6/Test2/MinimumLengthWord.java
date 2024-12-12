/*
Problem statement
Given a string S (that can contain multiple words), you need to find the word which has minimum length.

Note : If multiple words are of same length, then answer will be first minimum length word in the string. Words are seperated by single space only.
Detailed explanation ( Input/output format, Notes, Images )
Input Format :
String S
Output Format :
Minimum length word
Constraints :
1 <= Length of String S <= 10^5

Sample Input 1 :
this is test string
Sample Output 1 :
is
Sample Input 2 :
abc de ghihjk a uvw h j
Sample Output 2 :
a
*/


public class MinimumLengthWord {
    public static String minLengthWord(String input){
		
		// Write your code here
		String[] arr = input.split(" ");
		int min = Integer.MAX_VALUE;
		String result = "";
		for(int i=arr.length-1;i>=0;i--){
			if(arr[i].length() <= min){
				min = arr[i].length();
				result = arr[i];
			}
		}

		return result;

	}
}


class MinimumLengthWord2 {
    public static String minLengthWord(String input) {
        int minStart = -1; // To store the starting index of the minimum length word
        int minLength = Integer.MAX_VALUE; // To store the length of the minimum length word

        int currentStart = 0; // To store the starting index of the current word
        int i = 0; // Loop variable

        // Iterate through the input string
        for (; i < input.length(); i++) {
            if (input.charAt(i) == ' ') { // Check if the current character is a space
                int currentWordLength = i - currentStart; // Calculate the length of the current word
                if (currentWordLength < minLength) { // Check if the current word is shorter than the minimum length found so far
                    minLength = currentWordLength; // Update the minimum length
                    minStart = currentStart; // Update the starting index of the minimum length word
                }
                currentStart = i + 1; // Update the starting index for the next word
            }
        }

        // Handle the last word in the input string
        if (minStart == -1) { // If no spaces were found, the entire input is a single word
            return input;
        } else {
            int currentWordLength = i - currentStart; // Calculate the length of the last word
            if (currentWordLength < minLength) { // Check if the last word is shorter than the minimum length found so far
                minLength = currentWordLength; // Update the minimum length
                minStart = currentStart; // Update the starting index of the minimum length word
            }

            // Return the substring representing the minimum length word
            return input.substring(minStart, minStart + minLength);
        }
    }
}
