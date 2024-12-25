/*
Problem statement
Given an integer array (of length n), find and return all the subsets of input array.

NOTE- Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.

Note :
The order of subsets are not important.


Detailed explanation ( Input/output format, Notes, Images )
Input format :

Line 1 : Size of array

Line 2 : Array elements (separated by space)

Expected Time Complexity: O(2^N), where N is the size of given array
Sample Input:
3
15 20 12
Sample Output:
[] (this just represents an empty array, don't worry about the square brackets)
12 
20 
20 12 
15 
15 12 
15 20 
15 20 12
*/
public class ReturnSubsetOfAnArray {
    // Return a 2D array that contains all the subsets
	public static int[][] subsets(int input[]) {
		// Write your code here
		// basecase
		if(input.length == 0){
			int[][] output = {{}};
			return output;
		}

		// prepare smallinput (skip first element from input)
		int[] smallInput = new int[input.length-1];
		for(int i=0; i<smallInput.length; i++){
			smallInput[i] = input[i+1];
		}

		// make recursive call and get smalloutput
		int[][] smallOutput = subsets(smallInput);

		// prepare final output
		// will have twice size of smalloutput

		// 1st half without skipped first element of input
		int[][] output = new int[smallOutput.length * 2][];
		int i=0;
		for(; i<smallOutput.length; i++){
			output[i] = smallOutput[i];
		}
		// 2nd half with the skipped first element of input
		for(int j=0;j<smallOutput.length; j++){
			output[i+j] = new int[smallOutput[j].length+1];
			int k=0;
			output[i+j][k++] = input[0];
			for(;k<=smallOutput[j].length; k++){
				output[i+j][k] = smallOutput[j][k-1];
			}
		}

		// return final output
		return output;
	}
}
