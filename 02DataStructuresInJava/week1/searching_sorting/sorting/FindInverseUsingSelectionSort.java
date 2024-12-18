/*
Problem statement
You have a list of numbers that are not in order. You want to find the sum of the differences between the indices of pairs of numbers that are in the wrong order. A pair of numbers is considered to be in the wrong order if the smaller number comes after the larger number in the list.

Example:
Input: ‘N’ = 5 
‘A’ = [3, 2, 11, 5, 1]

Output: 6
Detailed explanation ( Input/output format, Notes, Images )
Input format :
The first line of input contains an integer ‘N’, denoting the size of the array/list. The second line contains ‘N’ single space-separated integers representing the elements in the array/list.
Output Format :
The output should be a single integer - the number of inversions in the array/list.
Constraints :
1 <= N <= 10^4
1 <= nums[i] <= 10^9
Time Limit: 1 sec
Sample Input 1:
5
3 2 11 5 1
Sample Output 1:
6
Explanation
When we apply selection sort, first swap will happen between array[0] to array[4], inversion will be (index of arrar[4]-index of array[0]) = 4-0=4 and the array after this will be [1, 2, 11, 5, 3], still the array is not sorted. So we will apply selection sort again, the swap will now take place between array[2] and array[4], inversion will be 4+(index of arrar[4]-index of array[2])=4+(4-2)=4+2=6.So the final sorted array now will be [1,2,3,5,11]
Sample Input 2:
7
17 5 14 16 11 18 10
Sample Output 2:
10
*/

public class FindInverseUsingSelectionSort {
    public static int getInversions(int[] arr, int n){

        int inversion = 0;
        for(int i=0; i<n-1; i++){
            int minIndex = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            if(minIndex != i){
                inversion+=(minIndex - i);
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }

        }
        return inversion;
    }
}
