/*
Problem statement
You have been given a sorted(in ascending order) integer array/list('nums') of size N and an element 'target'. Your task is to return the index of closest element to the 'target' in the array 'nums'.

Example:
Input: ‘N’ = 7 ‘target’ = 4
‘A’ = [1, 3, 7, 9, 11, 12, 45]

Output: 1

Explanation: For nums = [1, 3, 7, 9, 11, 12, 45],
The element 3 is closest to the target element , so we will return the index of 3.
Hence, the answer is '1'.
Detailed explanation ( Input/output format, Notes, Images )
Input format :
The first line contains an Integer 'N', which denotes the size of the array/list.

The second line contains 'N' single space-separated integers representing the elements in the array/list.

The third line contains the value of 'target' to be searched for in the array/list.
Output Format :
Return the index closest or at which 'target' is present for each test case.
Constraints :
1 <= N <= 10^4
1 <= nums[i] <= 10^9
1 <= target <= 10^9
Time Limit: 1 sec
Sample Input 1:
5
1 2 3 4 5
4
Sample Output 1:
3
Explanation of sample output 1:
For nums = [1, 2, 3, 4, 5],
The element 4 is already present, so we will return the index of 4.
Hence, the answer is '3'.
Sample Input 2:
7
6 7 11 13 21 44 46
22
Sample Output 2:
4
Explanation of sample output 2:
For nums = [6, 7, 11, 13, 21, 44, 46],
The element 21 is closest to the target element so we will return the index of element 21.
Hence, the answer is '4'
*/

// solution 1
public class FindClosestIndex {
    public static int binarySearchClosest(int []nums, int left, int right, int target) {
        // if array has a single element or target is less than first element
        if(nums.length == 1 || target < nums[0])
            return 0;
        
        for(int i=1;i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }else if(nums[i-1] < target && target < nums[i]){
                return i-1;
            }
        }

        // if target is greater than all elements in array then return last index which is closet
        return nums.length-1;
    }
}


// solution 2
// make use of binary search since array is sorted
class FindClosestIndex2 {
    public static int binarySearchClosest(int []nums, int left, int right, int target) {
        // Handle edge cases when target is outside the range of the array
        if (target <= nums[0]) {
            return 0;
        }
        if (target >= nums[nums.length - 1]) {
            return nums.length - 1;
        }

        // Perform binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid is the target
            if (nums[mid] == target) {
                return mid;
            }

            // Adjust the search range
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // At this point, `left` and `right` are neighbors of the target
        // Compare which is closer to the target
        if ((nums[left] - target) < (target - nums[right])) {
            return left;
        } else {
            return right;
        }
    }
}