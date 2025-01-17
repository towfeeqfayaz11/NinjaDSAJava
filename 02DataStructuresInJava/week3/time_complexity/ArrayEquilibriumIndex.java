/*
Problem statement
For a given array/list(ARR) of size 'N,' find and return the 'Equilibrium Index' of the array/list.

Equilibrium Index of an array/list is an index 'i' such that the sum of elements at indices [0 to (i - 1)] is equal to the sum of elements at indices [(i + 1) to (N-1)]. One thing to note here is, the item at the index 'i' is not included in either part.

If more than one equilibrium indices are present, then the index appearing first in left to right fashion should be returned. Negative one(-1) if no such index is present.

Example:
Let's consider an array/list Arr = [2, 3, 10, -10, 4, 2, 9]  of size, N = 7.

There exist three equilibrium indices, one at 2, another at 3, and another at 5.

At index 2, the sum of all the elements to the left, [2 + 3] is 5, and the elements to its right, [-10 + 4 + 2 + 9] is also 5. Hence index 2 is an equilibrium index according to the condition we want to achieve. Mind it that we haven't included the item at index 2, which is 10, to either of the parts.

Similarly, we can see at index 3 and 5, the elements to its left sum up to 15 and 9 respectively and to the right, sum up to 15 and 9 respectively either. 

Hence the answer would be 2.
Detailed explanation ( Input/output format, Notes, Images )
Input Format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains an integer 'N' representing the size of the first array/list.

The second line contains 'N' single space separated integers representing the elements of the array/list
Output Format :
For each test case, print the 'Equilibrium Index'.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^6

Time Limit: 1 sec 
Sample Input 1 :
1
5
1 4 9 3 2
Sample Output 1 :
2
Sample Input 2 :
2
3
1 4 6
3
1 -1 4
Sample Output 2 :
-1
2
*/



// Solution1
/*
public class ArrayEquilibriumIndex {
    public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
		if(arr.length == 0)
		return -1;

		// initializing the variables for leftSum, totalSum and rightSum
		int lsum=0, tsum=0, rsum=0, ans=-1;
		for(int i=0;i<arr.length;i++){
			tsum+=arr[i];
		}

		int i=0;
		while(i<arr.length){
			// update right sum if index is not out of bound
			rsum=tsum - lsum - arr[i];
			if(lsum == rsum){
				ans = i;
				break;
			}else{
				// add current element to left sum
				lsum+=arr[i];
				// increment current index
				i++;
			}
		}
		return ans;
	}
}
*/


// Solution2: Improved logic
public class ArrayEquilibriumIndex {
    public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
		if(arr.length == 0)
		return -1;

		// initializing the variables for leftSum, totalSum and rightSum
		int lsum=0, rsum=0;
		for(int i=0;i<arr.length;i++){
			rsum+=arr[i];
		}

		int i=0;
		while(i<arr.length){
			// update right sum if index is not out of bound
			rsum= rsum - arr[i];
			if(lsum == rsum){
				return i;
			}else{
				// add current element to left sum
				lsum+=arr[i];
				// increment current index
				i++;
			}
		}
		return -1;
	}
}