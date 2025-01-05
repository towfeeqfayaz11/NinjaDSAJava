/*
Problem statement
You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].

Now, in the given array/list, 'M' numbers are present twice and one number is present only once.

You need to find and return that number which is unique in the array/list.

 Note:
Unique element is always present in the array/list according to the given condition.
Detailed explanation ( Input/output format, Notes, Images )
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.
Output Format :
For each test case, print the unique element present in the array.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^6

Time Limit: 1 sec
Sample Input 1:
1
7
2 3 1 6 3 6 2
Sample Output 1:
1
Sample Input 2:
2
5
2 4 7 2 7
9
1 3 1 3 6 6 7 10 7
Sample Output 2:
4
10
*/

/*
Approach1:
    For each element of the input array, run loop on the rest of the array, to check whether the same element exists or not,
    ifit exists then we check for the next element, else return that element as we found unique element

Approach2:
    Sort the array and then check for the adjacent elements, if they are same then move to the next element,
    else return that element as we found unique element


Approach3:
    XOR all the elements of the array, as XOR of two same elements is 0, so the remaining element will be the unique element

XOR properties:
    This approach uses two XOR properties:
        1. XOR of two same elements is 0
        2. XOR of any element with 0 is the element itself
*/


public class FindUniqueElement {
    public static int findUnique(int[] arr) {
		//Your code goes here
		int XOR = 0;
		for(int i=0;i<arr.length;i++){
			XOR = XOR ^ arr[i];
		}

		return XOR;
	}
}
