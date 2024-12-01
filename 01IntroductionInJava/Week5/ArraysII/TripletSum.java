/*
Problem statement
You have been given a random integer array/list(ARR) and a number X. Find and return the number of triplets in the array/list which sum to X.

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
1 <= t <= 50
0 <= N <= 10^2
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

/*
Approach 1: (brute force)
using three nested loops to iterate over the array and check for the sum of each triplet.

Time Complexity: O(n^3)
Space Complexity: O(1)
*/

/*
public class TripletSum {
    public static int findTriplet(int[] arr, int x) {
    	//Your code goes here
        int count = 0;
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i] + arr[j] + arr[k] == x)
                    count++;
                }
            }
        }

        return count;
    }
}
*/

//---------------------------------------------------------------------------------

/*
Approach 2: (using two pointers)
Sort the array and use two pointers to find the triplets. This avoids a third nested loop.

Time Complexity: O(n^2)
Space Complexity: O(1)
*/

/*
import java.util.Arrays;
class TripletSum2 {
    public static int findTriplet(int[] arr, int x) {
        int count = 0;
        int n = arr.length;
        Arrays.sort(arr); // Sorting the array

        // Iterate through the array
        for (int i = 0; i < n - 2; i++) {
            int target = x - arr[i];
            int left = i + 1;
            int right = n - 1;

            // Two-pointer approach
            while (left < right) {
                if (arr[left] + arr[right] == target) {
                    count++;
                    left++;
                    right--;
                } else if (arr[left] + arr[right] < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return count;
    }
}
*/

//----------------------------------------------------------------

/*
Approach 3: HashMap
Instead of sorting, use a hashmap to store frequencies of array elements. This avoids sorting but requires more memory.

Time Complexity: O(n^2)
Space Complexity: O(n)
*/

import java.util.HashMap;
class TripletSum3 {
    public static int findTriplet(int[] arr, int x) {
        int count = 0;
        
        for(int i=0;i<arr.length-2; i++){
            int target = x - arr[i];
            HashMap<Integer, Integer> map = new HashMap<>(); // make sure for each iteration of outer loop, new hashmap is created
            for(int j=i+1;j<arr.length;j++){
                if(map.containsKey(target - arr[j])){
                    count += map.get(target- arr[j]);
                }

                map.put(arr[j], map.getOrDefault(arr[j], 0)+1);
            }
        }

        return count;
    }
}
