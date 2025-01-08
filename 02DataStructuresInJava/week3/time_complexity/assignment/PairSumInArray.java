/*
Problem statement
You have been given an integer array/list(ARR) and a number 'num'. Find and return the total number of pairs in the array/list which sum to 'num'.

Note:
Given array/list can contain duplicate elements. 
Detailed explanation ( Input/output format, Notes, Images )
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the first array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.

Third line contains an integer 'num'.
Output format :
For each test case, print the total number of pairs present in the array/list.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^4
0 <= num <= 10^9

Time Limit: 1 sec
Sample Input 1:
1
9
1 3 6 2 5 4 3 2 4
7
Sample Output 1:
7
Sample Input 2:
2
9
1 3 6 2 5 4 3 2 4
12
6
2 8 10 5 -2 5
10
Sample Output 2:
0
2


 Explanation for Input 2:
Since there doesn't exist any pair with sum equal to 12 for the first query, we print 0.

For the second query, we have 2 pairs in total that sum up to 10. They are, (2, 8) and (5, 5).
*/

// Approach 1:
// Using brute force
// T = O(N^2)
// S = O(1)

import java.util.Arrays;
import java.util.HashMap;

public class PairSumInArray {
    public static int pairSum(int[] arr, int num) {
		//Your code goes here
		// brute force 
		// T = O(N^2)
		// S = O(1)
		int count =0;
		for(int i=0;i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]+arr[j] == num)
					count++;
			}
		}

		return count;
	}
}


// Approach 2:
// Using HashMap
// T = O(N)
// S = O(1)
class PairSumInArray2 {
	public static int pairSum(int[] arr, int num) {
		//Your code goes here
		// using hashmap
		// T = O(N)
		// S = O(N)

		HashMap<Integer, Integer> hm = new HashMap<>();
		int count=0;

		for(int ele: arr){
			int complement = num - ele;
			if(hm.containsKey(complement)){
				count+=hm.get(complement);
			}
			hm.put(ele, hm.getOrDefault(ele, 0)+1);
		}

		return count;
	}
}

// Approach 3:
// Using sorting and two pointer approach
// T = O(NlogN)
// S = O(1)
class PairSumInArray3 {
	public static int pairSum(int[] arr, int num) {
		//Your code goes here

        Arrays.sort(arr);
        
		int startIndex = 0;
		int endIndex = arr.length-1;
		int pairSumCount = 0;

		while(startIndex<endIndex){
			if(arr[startIndex] + arr[endIndex] < num){
				startIndex++;
			}else if(arr[startIndex] + arr[endIndex] > num){
				endIndex--;
			}else{
				if(arr[startIndex] == arr[endIndex]){
					int elementCount = endIndex - startIndex + 1;
					pairSumCount+=(elementCount * (elementCount-1))/2;
					return pairSumCount;
				}

				int startIndtemp = startIndex + 1;
				int endIndtemp = endIndex -1;

				while(startIndtemp<=endIndtemp && arr[startIndtemp] == arr[startIndex]){
					startIndtemp++;
				}
				while(startIndtemp<=endIndtemp && arr[endIndtemp] == arr[endIndex]){
					endIndtemp--;
				}

				int totalElementsFromStart = startIndtemp - startIndex;
				int totalElementsFromEnd = endIndex - endIndtemp;

				pairSumCount+= (totalElementsFromStart * totalElementsFromEnd);

				startIndex = startIndtemp;
				endIndex = endIndtemp;
			}
		}

		return pairSumCount;

	}
}