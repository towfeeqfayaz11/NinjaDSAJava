/*
Problem statement
Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save all the indexes in the output array (in increasing order).

Do this recursively. Indexing in the array starts from 0.

Hint:
Try making a helper function with the required arguments and call the helper function from the allIndexes function.
Detailed explanation ( Input/output format, Notes, Images )
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
Return all the indexes in the output array (in increasing order).
Constraints :
1 <= N <= 10^3
Sample Input :
5
9 8 10 8 8
8
Sample Output :
1 3 4
*/


public class AllIndexesOfX {
    public static int[] allIndexes(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		return getIndexArr(input, x, 0);
	}

	public static int[] getIndexArr(int[] input, int x, int currIndex){
		if(currIndex == input.length)
			return new int[0];

		int[] smallOutput = getIndexArr(input, x, currIndex+1);

		if(input[currIndex] == x){
			int[] output = new int[smallOutput.length+1];
			output[0] = currIndex;

			for(int i=0;i<smallOutput.length; i++){
				output[i+1] = smallOutput[i];
			}

			return output;
		}

		return smallOutput;
	}
}
