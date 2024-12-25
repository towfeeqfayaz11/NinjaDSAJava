/*
Problem statement
Given an array A of size n and an integer K, return all subsets of A which sum to K.

Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.

Note :
The order of subsets are not important.


Detailed explanation ( Input/output format, Notes, Images )
Input format :
Line 1 : Integer n, Size of input array
Line 2 : Array elements separated by space
Line 3 : K 
Constraints :
1 <= n <= 20

Sample Input :
9 
5 12 3 17 1 18 15 3 17 
6
Sample Output :
3 3
5 1
*/

// Approach 1
/*
public class ReturnSubsetsSumToK {
    	// Return a 2D array that contains all the subsets which sum to k
	public static int[][] subsetsSumK(int input[], int k) {
		// Write your code here
		if(input.length == 0){
			if(k == 0)
			return new int[1][0];
			else
			return new int[0][0];
		}

		int[] smallInput = new int[input.length-1];
		for(int i=0;i<smallInput.length;i++){
			smallInput[i] = input[i+1];
		}
		int[][] smallOutput1 = subsetsSumK(smallInput, k-input[0]);
		int[][] smallOutput2 = subsetsSumK(smallInput, k);

		int[][] output = new int[smallOutput1.length + smallOutput2.length][];

		int index = 0;
		for(int i=0;i<smallOutput1.length;i++){
			output[index] = new int[smallOutput1[i].length + 1];
			output[index][0] = input[0];
			for(int j=0;j<smallOutput1[i].length;j++){
				output[index][j+1] = smallOutput1[i][j];
			}
			index++;
		}

		for(int i=0;i<smallOutput2.length;i++){
			output[index] = new int[smallOutput2[i].length];
			for(int j=0;j<smallOutput2[i].length;j++){
				output[index][j] = smallOutput2[i][j];
			}
			index++;
		}

		return output;


	}
}
*/

// Approach 2 (slightly improved for adding smallOutput2 to output)
public class ReturnSubsetsSumToK {

	// Return a 2D array that contains all the subsets which sum to k
	public static int[][] subsetsSumK(int input[], int k) {
		// Write your code here

		// basecase
		/*
			int[][] output = new int[1][0] ~= int[][] output2 = {{}};
		*/
		if(input.length == 0){
			if(k == 0)
			return new int[1][0];
			else
			return new int[0][0];
		}

		// prepare small input
		int[] smallInput = new int [input.length-1];
		for(int i=0;i<smallInput.length; i++){
			smallInput[i] = input[i+1];
		}

		// make recursive calls and receive small output
		//first recursive call with k subtracted by first element of input
		int[][] smallOutput1 = subsetsSumK(smallInput, k-input[0]);
		//2nd recursive call with k not subtracted by first element of input
		int[][] smallOutput2 = subsetsSumK(smallInput, k);

		// using smallOutput, prepare the output and return
		// first half will include the first element prepended
		int[][] output = new int[smallOutput1.length + smallOutput2.length][];
		int i=0;
		for(;i<smallOutput1.length; i++){
			int index=0;
			output[i] = new int[smallOutput1[i].length+1];
			output[i][index++] = input[0];
			for(int j=0; j<smallOutput1[i].length; j++){
				output[i][index] = smallOutput1[i][index-1];
				index++;
			}
		}
		
		// 2nd half will exclude the first element
		for(int j=0;j<smallOutput2.length; j++){
			output[i+j] = smallOutput2[j];
		}

		// return output as result
		return output;
	}
}
