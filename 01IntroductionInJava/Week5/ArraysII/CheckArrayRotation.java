/*
Problem statement
You have been given an integer array/list(ARR) of size N. It has been sorted(in increasing order) and then rotated by some number 'K' (K is greater than 0) in the right hand direction.

Your task is to write a function that returns the value of 'K', that means, the index from which the array/list has been rotated.

Detailed explanation ( Input/output format, Notes, Images )
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.
Output Format :
For each test case, print the value of 'K' or the index from which which the array/list has been rotated.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
2 <= N <= 10^5
Time Limit: 1 sec
Sample Input 1:
1
6
5 6 1 2 3 4
Sample Output 1:
2
Sample Input 2:
2
5
3 6 8 9 10
4
10 20 30 1
Sample Output 2:
0
3 
*/

/*
approach 1: brute force
Time complexity: O(n)
Space complexity: O(1)
*/
public class CheckArrayRotation {
    public static int arrayRotateCheck(int[] arr){
    	//Your code goes here
        for(int i=1;i<arr.length;i++){
            if(arr[i] < arr[i-1])
            return i;
        }

        return 0;
    }
}


// summarize in precise paragraph


/*
approach 2: binary search

Explanation in precise paragraph:
In this approach, we will use binary search to find the rotation point. We will initialize two 
pointers start and end to 0 and n-1 respectively. We will iterate until start is less than or
equal to end. We will calculate mid as start + (end-start)/2. We will check if mid is less than
end and arr[mid] is greater than arr[mid+1], then we will return mid+1 as the rotation point.
If mid is greater than start and arr[mid] is less than arr[mid-1], then we will return mid as
the rotation point. If arr[start] is less than arr[mid], then we will update start as mid+1,
else we will update end as mid-1. If we don't find the rotation point, then we will return 0.


Time complexity: O(logn)
Space complexity: O(1)
*/


class CheckArrayRotation2 {
    public static int arrayRotateCheck(int[] arr){
    	//Your code goes here
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid+1;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid;
            }
            if(arr[start] < arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return 0;
    }
}
