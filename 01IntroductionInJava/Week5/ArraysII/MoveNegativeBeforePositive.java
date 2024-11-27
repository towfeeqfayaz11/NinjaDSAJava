/*
Problem statement
You are given an array 'ARR' consisting of 'N' integers. You need to rearrange the array elements such that all negative numbers appear before all positive numbers.

Note:
The order of elements in the resulting array is not important.
Example:
Let the array be [1, 2, -3, 4, -4, -5]. On rearranging the array such that all negative numbers appear before all positive numbers we get the resulting array [-3, -5, -4, 2, 4, 1].
Detailed explanation ( Input/output format, Notes, Images )
Input format:
The very first line of input contains an integer ‘T’ denoting the number of test cases. 

The first line of every test case contains an integer ‘N’ denoting the number of elements present in the array.

The second line of every test case contains ‘N’ space-separated integers denoting the elements present in the array.
Output format:
For each test case, “Yes” is printed if the resulting array is correct otherwise “No”.

Output for each test case is printed on a separate line.
Constraints:
1 <= T <= 10
1 <= N <= 5 * 10^4
-10^5 <= ARR[i] <= 10^5

Where  ‘T’ represents the number of test cases and ‘N’ represents the number of elements present in the array.

Time Limit: 1 sec
Sample Input 1:
2
5
1 -4 -2 5 3
2
2 1    
Sample Output 1:
Yes
Yes
Explanation for Sample Input 1:
For the first test case we have, array: [1, -4, -2, 5, 3] and N = 5. On rearranging the array such that all negative numbers appear before all positive numbers we get the resulting array [-2, -4, 1, 5, 3].

For the second test case we have, array: [2, 1] and N = 2. There are no negative numbers. Hence, we do not require any rearrangement.
Sample Input 2:
3
4
1 -5 -5 3
5
-1 -2 3 4 5
1
-2
Sample Output 2:
Yes 
Yes
Yes
Explanation for Sample Input 2:
For the first test case we have, array: [1, -5, -5,  3] and N = 4. On rearranging the array such that all negative numbers appear before all positive numbers we get the resulting array [-5, -5, 1, 3].

For the second test case we have, array: [-1, -2, 3, 4, 5] and N = 5. There are already arranged in required way. Hence, we do not require any rearrangement.

For the third test case we have, array: [-2 ] and N = 1. The array is already arranged in required way. Hence, we do not require any rearrangement.
*/


/*
Approach 1:
using two pointer approach, where both pointers are starting from same end.
i = will point to the positive number
j = will iterate the array in search of negative number, once found will swap with i
    and increment both i and j. Otherwise, j will keep moving.

The advantage of this approach is that it maintains the order of elements in the array.

Time Complexity: O(n)
Space Complexity: O(1)

*/
public class MoveNegativeBeforePositive {
    public static int[] separateNegativeAndPositive(int a[]) {
        // using two pointer approach, where both pointers are starting from same end

        int i=0,j=0;
        int temp;
        while(j<a.length){
            if(a[j] < 0){
                temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                i++;
                j++;
            }else{
                j++;
            }
        }

        return a;
    }
}

/*
Approach 2:
using two pointer approach, where one pointer is starting from start and other from end.
i will keep tab of positive numbers and j will keep tab of negative numbers.
once found they will swap and increment i and decrement j.
If only one of them is found, then only that pointer will move.

This approach dosn't maintain the order of elements in the array in which they originally appeared.

Time Complexity: O(n)
Space Complexity: O(1)

*/

class MoveNegativeBeforePositive2 {
    public static int[] separateNegativeAndPositive(int a[]) {
        int i = 0, j = a.length-1;
        int temp;

        while(i<j){
            if(a[i] >= 0 && a[j] < 0){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }else if(a[i] < 0)
            i++;
            else if(a[j] >= 0)
            j--;
        }
        return a;
    }
}