/*
Problem statement
Write a program that returns minimum element in an array.



Note:
Math.min method is used to find the minimum of two numbers .
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1<=N<=10^5
Note for C++:
It is advisable to declare an array with a size that can accommodate all the elements, considering that N has a maximum value of 10^5.
Input 1:
5 
6 4 3 8 9
Output 1:
3
Input 2:
4
8 8 8 8
Output 2:
8
*/

// approach 1:
/*
public class SmallestElement {
    public static int minimum_element(int[] arr){
        int min = Integer.MAX_VALUE;

        for(int i: arr){
            min = Math.min(i,min);
        }

        return min;
		
    }
}
*/

// approach 2:
public class SmallestElement {
    public static int minimum_element(int[] arr){
        int min = arr[0];

        for(int i=1; i<arr.length; i++){
            min = Math.min(arr[i],min);
        }

        return min;
		
    }
}