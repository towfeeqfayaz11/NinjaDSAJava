/*
Problem statement
You have been given a random integer array/list(ARR) of size N. You are required to find and return the second largest element present in the array/list.

Detailed explanation ( Input/output format, Notes, Images )
Input format :
The first line contains an integer 'N' representing the size of the array/list.

The second line contains 'N' single space separated integers representing the elements in the array/list.
Output Format :
Return the second largest element in the array/list.
Constraints :
0 <= N <= 10^2
1<=arr[i]<=10^3

Time Limit: 1 sec
Sample Input 1:
5
4 3 10 9 2
Sample Output 1:
9
Sample Input 2:
7
13 6 31 14 29 44 3
Sample Output 2:
31
*/


// public class SecondLargestElementInArray {
//     public static int secondLargestElement(int[] arr, int n) {
//     	//using selection sort
//         for(int i=0;i<arr.length-1;i++){
//             int i_min=i;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[j]<arr[i_min])
//                 i_min = j;
//             }
//             int temp = arr[i];
//             arr[i] = arr[i_min];
//             arr[i_min]=temp;
//         }
//         return arr[n-2];
//     }
// }


public class SecondLargestElementInArray {
    public static int secondLargestElement(int[] arr, int n) {
    	int max=Integer.MIN_VALUE, secondMax=Integer.MIN_VALUE;

        for(int ele: arr){
            if(ele > max){
                secondMax = max;
                max = ele;
            }else if(ele < max && ele > secondMax){
                secondMax = ele;
            }
        }

        return secondMax;
    }
}