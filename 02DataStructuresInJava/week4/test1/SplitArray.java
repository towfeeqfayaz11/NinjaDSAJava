/*
Problem statement
Given an integer array A of size N, check if the input array can be divided in two groups G1 and G2 with following properties-

- Sum of both group elements are equal
- Group 1: All elements in the input, which are divisible by 5 
- Group 2: All elements in the input, which are divisible by 3 (but not divisible by 5). 
- Elements which are neither divisible by 5 nor by 3, can be put in either group G1 or G2 to satisfy the equal sum property. 
Group 1 and Group 2 are allowed to be unordered and all the elements in the Array A must belong to only one of the groups.



Return true, if array can be split according to the above rules, else return false.

Note: You will get marks only if all the test cases are passed.
Detailed explanation ( Input/output format, Notes, Images )
Input Format :
Line 1 : Integer N (size of array)
Line 2 : Array A elements (separated by space)
Output Format :
true or false
Constraints :
1 <= N <= 50
Sample Input 1 :
2
1 2
Sample Output 1 :
false
Sample Input 2 :
3
1 4 3
Sample Output 2 :
true
*/

public class SplitArray {
    public static boolean splitArray(int input[]) {
		/* Your class should be named solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/

		return splitArrayHelper(input, 0, 0, 0);
	}

	private static boolean splitArrayHelper(int[] input, int i, int lsum, int rsum){
		if(i==input.length){
			return lsum == rsum;
		}

		if(input[i]%5 == 0){
			lsum+=input[i];
		}else if(input[i]%3 == 0){
			rsum+=input[i];
		}else{
			return (splitArrayHelper(input, i+1, lsum+input[i], rsum) || 
						splitArrayHelper(input, i+1, lsum, rsum+input[i]));
		}

		return splitArrayHelper(input, i+1, lsum, rsum);
	}
}
