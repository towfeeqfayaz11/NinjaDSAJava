/*
Problem statement
Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.

First index means, the index of first occurrence of x in the input array.

Do this recursively. Indexing in the array starts from 0.

Detailed explanation ( Input/output format, Notes, Images )
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
first index or -1
Constraints :
1 <= N <= 10^3

Sample Input :
4
9 8 10 8
8
Sample Output :
1
*/

// solution 1
public class FindIndex {
    public static int firstIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/

		return findIndex(input, x, 0);
	}

	public static int findIndex(int[] input, int x, int index){
		if(index == input.length)
			return -1;
		
		if(input[index] == x)
			return index;
		
		return findIndex(input, x, index+1);
	}
}

// solutin 2
class FindIndexTwo {
    public static int firstIndex(int input[], int x) {
        if(input.length == 0)
            return -1;

        if(input[0] == x)
            return 0;


        int[] smallInput = new int[input.length - 1];
        for(int i = 1; i < input.length; i++) {
            smallInput[i - 1] = input[i];
        }

        int index = firstIndex(smallInput, x);
        if(index == -1)
            return -1;
        else
            return index + 1;
	}
}