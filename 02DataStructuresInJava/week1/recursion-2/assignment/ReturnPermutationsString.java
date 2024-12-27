/*
Problem statement
Given a string S, find and return all the possible permutations of the input string.

Note 1 : The order of permutations is not important. Note 2 : If original string contains duplicate characters, permutations will also be duplicates.
Detailed explanation ( Input/output format, Notes, Images )
Input Format :
String S
Output Format :
All permutations (in different lines)
Sample Input :
abc
Sample Output :
abc
acb
bac
bca
cab
cba
*/

// Solution 1
public class ReturnPermutationsString {
    public static String[] permutationOfString(String input){
		// Write your code here
		
		// basecase
		if(input.length() == 0){
			return new String[]{""};
		}

		// prepare output array with required length
		String[] output = new String[findFactorial(input.length())];
		
		// index pointer for output array;
		int index =0;
		// iterating over input to take one char at a time and send rest for recursive call
		for(int i=0; i<input.length(); i++){
			char ch = input.charAt(i);
			String smallInput = removCharAtIndex(input, i);

			// receive smallOutput from recursive call
			String[] smallOutput = permutationOfString(smallInput);

			// append the charater to all string outputs from smallOutput
			for(int j=0; j<smallOutput.length; j++){
				output[index++] = ch + smallOutput[j];
			}
		}

		return output;
	}

	public static int findFactorial(int n){
		int ans = 1;
		while(n>=1){
			ans *= n;
			n--;
		}

		return ans;
	}

	public static String removCharAtIndex(String input, int index){
		return input.substring(0,index) + input.substring(index+1);
	}
}


// Solution 2
class ReturnPermutationsString2 {
    public static String[] permutationOfString(String input){
		if(input.length() == 0){
            String[] output = {""};
            return output;
        }

        String[] smallerOutput = permutationOfString(input.substring(1));
        String[] output = new String[input.length() * smallerOutput.length];

        int k = 0;
        for(int i=0; i<smallerOutput.length; i++){
            String currentString = smallerOutput[i];
            for(int j=0; j<=currentString.length(); j++){
                output[k++] = currentString.substring(0,j) + input.charAt(0) + currentString.substring(j);
            }
        }
        return output;
	}
}
