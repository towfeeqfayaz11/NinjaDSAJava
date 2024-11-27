/*
Problem statement
You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1. Write a function to sort this array/list. Think of a solution which scans the array/list only once and don't require use of an extra array/list.

Note:
You need to change in the given array/list itself. Hence, no need to return or print anything. 
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
Time Limit: 1 sec
Sample Input 1:
1
7
0 1 1 0 1 0 1
Sample Output 1:
0 0 0 1 1 1 1
Sample Input 2:
2
8
1 0 1 1 0 1 0 1
5
0 1 0 1 0
Sample Output 2:
0 0 0 1 1 1 1 1
0 0 0 1 1  
*/


/*
Approach 1:
approach is simple, we will use a pointer ptr1 to point to initial index of the array,
and then, using another pointer ptr2 we will iterate over array, if we find an index
containing zero, then we will swap with the value pointed by ptr1, and increment ptr1
and start again

Complexity: O(N)
*/
public class Sort01 {
    
    public static void sortZeroesAndOne(int[] arr) {

        int j=0;
        for(int i=0;i<arr.length;i++){
            //if zero is found, swap with a position left to it, pointed by 
            if(arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}


/*
Approach 2:

class Sort01 {  

    public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here

        int i=0, j= arr.length-1;
        int temp = -1;
        while(i<j){
            if(arr[i] == 1 && arr[j] == 0){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;j--;
            }else if(arr[i] == 0 && arr[j] == 1){
                i++; j--;
            }else if(arr[i] == 0 && arr[j] == 0){
                i++;
            }else { // arr[i] == 1 && arr[j] == 1
                j--;
            }
        }
    }
}
    
*/