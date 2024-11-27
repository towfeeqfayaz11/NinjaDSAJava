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
0 <= N <= 10^3
Time Limit: 1 sec
Sample Input 1:
1
7
2 3 1 6 3 6 2
Sample Output 1:
1
Explanation: The array is [2, 3, 1, 6, 3, 6, 2]. Here, the numbers 2, 3, and 6 are present twice, and the number 1 is present only once. So, the unique number in this array is 1.
Sample Input 2:
2
5
2 4 7 2 7
9
1 3 1 3 6 6 7 10 7
Sample Output 2:
4
Explanation: In the first test case, the array is [2, 4, 7, 2, 7]. Here, the numbers 2 and 7 are present twice, and the number 4 is present only once. So, the unique number in this array is 4.

10
Explanation: In the second test case, the array is [1, 3, 1, 3, 6, 6, 7, 10, 7]. Here, the numbers 1, 3, 6, and 7 are present twice, and the number 10 is present only once. So, the unique number in this array is 10.
 */


// brute force (O(N^2))
/*
public class FindUnique {
    public static int findUnique(int[] arr){

      for(int i=0;i<arr.length;i++){
        int j = 0;
        while(j<arr.length){
          if(j != i && arr[j] == arr[i]){
            break;
          }
          j++;
        }
        if(j==arr.length){
          return arr[i];
        }
      }

      return -1;
    }
}
*/



// optimized ( using or operator)
/*
public class FindUnique {

    public static int findUnique(int[] arr){
		int num = arr[0];
    for(int i=1;i<arr.length;i++){
      num = num ^ arr[i];
    }

    return num;
    }
}

*/



// using sorting
/*
We can Use Sorting to solve the problem in O(nLogn) time. The idea is simple,
first sort the array, so that all occurrences of every element become consecutive. Once the
occurrences become consecutive, we can traverse the sorted array and print the unique element
in O(n) time.
*/
import java.util.Arrays;
class FindUnique2 {

  public static int findUnique(int[] arr){
    Arrays.sort(arr);

    for(int i=0;i<arr.length-1;i+=2){ // iterating and checking in pairs (i+=2)
      if(arr[i] != arr[i+1]){
        return arr[i];
      }

    }

    return arr[arr.length-1]; // if nothing matches that means last 
  }

}
