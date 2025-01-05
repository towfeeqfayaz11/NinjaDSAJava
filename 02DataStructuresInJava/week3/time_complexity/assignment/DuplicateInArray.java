/*
Problem statement
You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2).
Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3, and among these,
there is a single integer value that is present twice. You need to find and return that duplicate number present in the array.

Note :
Duplicate number is always present in the given array/list.
Detailed explanation ( Input/output format, Notes, Images )
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.
Output Format :
For each test case, print the duplicate element in the array/list.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^6

Time Limit: 1 sec
Sample Input 1:
1
9
0 7 2 5 4 7 1 3 6
Sample Output 1:
7
Sample Input 2:
2
5
0 2 1 3 1
7
0 3 1 5 4 3 2
Sample Output 2:
1
3
*/

/*
Approach 1:
    In this approach you need to run two loops, pick an element from the first loop and
    then in the inner loop check if the element appears once again or not, if yes then return that
    element, otherwise move to the next element.
    This method doesn’t use the other useful data provided in questions like range of numbers is
    between 0 to n-2 and hence, it is increasing the time complexity.

Approach 2:
    A better solution for this problem can be by using XOR operator. Using XOR
    operator, we can solve this problem in one traversal only. The following facts about XOR
    operation will be useful for this question:
    1. If we XOR a number by itself, even number of times then it will give you 0.
    2. If we XOR a number with itself, odd number of times, then it will give you the number
    itself.
    3. Also XOR of a number with 0 gives you that number again.
    So, if we take XOR of all the elements present in the array with every element in the range 0 to
    n-2, then all the elements of that array except the duplicate element are XORed 2 times and
    hence, their resultant is 0. But the duplicate element is XORed 3 times, hence, its resultant is the
    number itself. Hence, you will get you answer as the duplicate number present in the array.

Approach 3:
    Another approach can be to sort the array and then check for the adjacent elements, if they are
    same then move to the next element, else return that element as we found the duplicate element.

Approach 4:
    Another approach can be to use the sum of the elements of the array and then subtract the sum
    of the elements from the sum of the first n-2 natural numbers, the difference will be the duplicate
    element.

    To explain further, this approach is to make use of the condition that all elements lies between 0
    and n-2. So first calculate the sum of all natural numbers between 0 to n-2 by using the direct
    formula ((n - 1) * (n - 2)) / 2 and sum of all elements of the array. Now, subtract the sum of all
    natural numbers between 0 to n-2 from sum of all elements of the array. This will give you the
    duplicate element present in the array.

*/

// Implementing approach 4:
public class DuplicateInArray {
    /**
     * 
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int findDuplicate(int[] arr) {
        int sumOfNminusTwoNaturalNumbers = 0; // sum of first n-2 natural numbers
        for (int i = 0; i <= arr.length - 2; i++) {
            sumOfNminusTwoNaturalNumbers += i;
        }

        int sumOfArrayElements = 0; // sum of all elements in the array
        for (int i = 0; i < arr.length; i++) {
            sumOfArrayElements += arr[i];
        }

        return sumOfArrayElements - sumOfNminusTwoNaturalNumbers;
    }
}

// Implementing approach 3 using XOR:
class DuplicateInArray2 {
    /**
     * 
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int findDuplicate(int[] arr) {
        int XOR = 0;

        // XOR of numbers from 0 to n-2
        for (int i = 0; i < arr.length - 1; i++) {
            XOR = XOR ^ i;
        }

        // XOR of all the elements present in the array with every element in the range 0 to n-2
        for (int i = 0; i < arr.length; i++) {
            XOR = XOR ^ arr[i];
        }
        
        // all the elements of that array except the duplicate element are XORed 2 times and hence, their resultant is 0.
        // But the duplicate element is XORed 3 times, hence, its resultant is the number itself.
        return XOR;
    }
}