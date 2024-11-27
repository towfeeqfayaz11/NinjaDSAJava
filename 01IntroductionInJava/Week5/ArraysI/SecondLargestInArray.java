/*
Problem statement
You have been given a random integer array/list(ARR) of size N. You are required to find and return the second largest element present in the array/list.

Detailed explanation ( Input/output format, Notes, Images )
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


// Approach 1:
public class SecondLargestInArray {
    static int secondLargestElement(int[] arr, int n) {
        // Write your code here.
        int max = Integer.MIN_VALUE;
        int secondMax = max;

        for(int ele: arr){
            if(ele > max){
                secondMax = max;
                max = ele;
            }else if(ele > secondMax){
                secondMax = ele;
            }

        }
        return secondMax;
    }
}


// Approach 2:
/*
public class SecondLargestInArray {  

    public static int secondLargestElement(int[] arr, int n) {
    	//Your code goes here

        int max1 = arr[0];
        int max2 = max1;

        for(int i=1;i<arr.length;i++){
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }else if(arr[i] > max2){
                max2 = arr[i];
            }
        }

        return max2;
    }

}
*/