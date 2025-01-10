/*
Problem statement
You have been given a random integer array/list(ARR) and a number X. Find and return the triplet(s) in the array/list which sum to X.

Note :
Given array/list can contain duplicate elements.
Detailed explanation ( Input/output format, Notes, Images )
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the first array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.

Third line contains an integer 'X'.
Output format :
For each test case, print the total number of triplets present in the array/list.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
0 <= X <= 10^9

Time Limit: 1 sec
Sample Input 1:
1
7
1 2 3 4 5 6 7 
12
Sample Output 1:
5
Sample Input 2:
2
7
1 2 3 4 5 6 7 
19
9
2 -5 8 -6 0 5 10 11 -3
10
Sample Output 2:
0
5


 Explanation for Input 2:
Since there doesn't exist any triplet with sum equal to 19 for the first query, we print 0.

For the second query, we have 5 triplets in total that sum up to 10. They are, (2, 8, 0), (2, 11, -3), (-5, 5, 10), (8, 5, -3) and (-6, 5, 11)
*/


// NOTE: key concept is keeping tab of duplicate elements



// solution1: brute force approach
// T=O(N^3)
// S=O(1)

import java.util.Arrays;
import java.util.HashMap;

public class TripletSum {
    public static int tripletSum(int[] arr, int num) {
		int count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				for(int k=j+1; k<arr.length;k++){
					if(arr[i]+arr[j]+arr[k] == num)
						count++;
				}
			}
		}

		return count;
	}
}

// solution2: using hashmap
// T=O(N^2)
// S=O(N)
class TripletSum2 {
    public static int tripletSum(int[] arr, int num) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            // HashMap to store frequencies of elements for the current pair
            HashMap<Integer, Integer> hm = new HashMap<>();
            
            for (int j = i + 1; j < arr.length; j++) {
                int target = num - (arr[i] + arr[j]); // Calculate the third value needed
                
                // Check if the target is already in the HashMap
                if (hm.containsKey(target)) {
                    count += hm.get(target); // Add the frequency of the target
                }
                
                // Add the current element to the HashMap
                hm.put(arr[j], hm.getOrDefault(arr[j], 0) + 1);
            }
        }

        return count;
    }
}

/*
 Approach 3: sorting and two pointer approach
 Time Complexity : O(n^2)
 Space Complexity : o(1)
 Where 'n' is the size of the Array/List
*/

class TripletSum3 {	

	public static int tripletSum(int[] arr, int num) {
		//Your code goes here
        Arrays.sort(arr);

		int ans = 0;
		for(int i=0;i<arr.length;i++){
			int low=i+1;
			int high = arr.length-1;
			while(low<high){
				int currSum = arr[i] + arr[low] + arr[high];
				if(currSum < num){
					low++;
				}else if(currSum > num){
					high--;
				}else{
					ans++;
					int tempHigh = high-1;
					while(tempHigh>low){
						if(arr[tempHigh] == arr[high]){
							ans++;
							tempHigh--;
						}else{
							break;
						}
					}
					low++;
				}
			}
		}

		return ans;
	}
}