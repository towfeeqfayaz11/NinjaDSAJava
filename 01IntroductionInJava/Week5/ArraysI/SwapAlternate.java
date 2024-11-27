/*
Problem statement
You have been given an array/list(ARR) of size N. You need to swap every pair of alternate elements in the array/list.

You don't need to print or return anything, just change in the input array itself.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
Time Limit: 1sec
Sample Input 1:
1
6
9 3 6 12 4 32
Sample Output 1 :
3 9 12 6 32 4
Sample Input 2:
2
9
9 3 6 12 4 32 5 11 19
4
1 2 3 4
Sample Output 2 :
3 9 12 6 32 4 11 5 19 
2 1 4 3 

public class Solution {
    
    public static void swapAlternate(int arr[]) {
    	//Your code goes here
        if(arr.length < 2)
        return;

        int i=0, j=1;
        int temp;


 */

 public class SwapAlternate {

    public static void swapAlternate(int arr[]) {
    	//Your code goes here
        if(arr.length < 2)
        return;

        int i=0, j=1;
        int temp;

        while(i<arr.length && j<arr.length){
            temp = arr[i]; 
            arr[i] = arr[j];
            arr[j] = temp;
            i+=2;
            j+=2;
        }

    }
}
