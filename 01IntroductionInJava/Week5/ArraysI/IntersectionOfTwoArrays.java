/*
Problem statement
You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.

Note :
Input arrays/lists can contain duplicate elements.

The intersection elements printed would be in the order they appear in the first array/list(ARR1)


Detailed explanation ( Input/output format, Notes, Images )
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the first array/list.

Second line contains 'N' single space separated integers representing the elements of the first the array/list.

Third line contains an integer 'M' representing the size of the second array/list.

Fourth line contains 'M' single space separated integers representing the elements of the second array/list.
Output format :
For each test case, print the intersection elements in a row, separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
0 <= M <= 10^3
Time Limit: 1 sec 
Sample Input 1 :
2
6
2 6 8 5 4 3
4
2 3 4 7 
2
10 10
1
10
Sample Output 1 :
2 4 3
10
Sample Input 2 :
1
4
2 6 1 2
5
1 2 3 4 2
Sample Output 2 :
2 1 2
Explanation for Sample Output 2 :
Since, both input arrays have two '2's, the intersection of the arrays also have two '2's. The first '2' of
first array matches with the first '2' of the second array. Similarly, the second '2' of the first array matches
with the second '2' if the second array.
 */

 //---------------------------------------------------------------------------

// approach1: brute force (O(N^2))
/*
public class IntersectionOfTwoArrays {
    public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i] + " ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }
}
*/

 //---------------------------------------------------------------------------

// approach2: sorting(O(NlogN)) (but since the question asks to maintain order of intersection, sorting won't be helpful here)
/*
import java.util.Arrays;
public class IntersectionOfTwoArrays {
    public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0, j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){
                i++;
            }else if(arr1[i] > arr2[j]){
                j++;
            }else{
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
    }
}
*/

 //---------------------------------------------------------------------------

// approach3: using a HashMap(O(M+N))
/*
To continue with the hashmaps we can proceed with the following steps:
1. Initialize an empty hashmap map.
2. Iterate through the first array, and put every element of this array in the mapp with its
corresponding count.
3. Now for every element of the second array, search it in the hashmap and if it is present
then print it and decrement its corresponding count. After decrement, if the corresponding
count becomes zero, then we should remove the element from the mapp.
*/
import java.util.HashMap;
public class IntersectionOfTwoArrays {
    public static void intersections(int arr1[], int arr2[]) {
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        // insert arr1 with frequency in map
        for(int ele: arr2){
            if(map.containsKey(ele)){
                map.put(ele, map.get(ele)+1);
            }else{
                map.put(ele, 1);
            }
        }

        // iterate over arr2, if ele is in map, print and decrement its corresponding count in key
        for(int ele: arr1){ // elements to be printed should be in order in which they appear in arr1 (as per constraints)
            if(map.containsKey(ele)){
                int count = map.get(ele);
                count--;

                if(count == 0){
                    map.remove(ele);
                }else{
                    System.out.print(ele + " ");
                    map.put(ele, count);
                }
            }
        }

    }
}

