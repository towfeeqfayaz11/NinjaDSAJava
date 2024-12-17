/*
Problem statement
You are given a positive integer ‘N’. Your task is to find and return its square root. If ‘N’ is not a perfect square, then return the floor value of sqrt(N).



Note:
In case, if you are facing the test case failure, take the variables inside the function in 'unsigned int' data type.
Example:
Input: ‘N’ = 6

Output: 2

Explanation: The square root of the number 6 lies between 2 and 3, so the floor value is 2.
Detailed explanation ( Input/output format, Notes, Images )
Input Format:
The first line of input contains the Integer ‘N’.
Output Format:
Return a single line containing an integer denoting the square root of ‘N’.
Constraints:
0 <= N <= 10 ^ 16

Time Limit: 1 sec.
Sample Input 1:
6
Sample Output 1:
2
Explanation of Sample Input 1:
The square root of the given number 6 lies between 2 and 3, so the floor value is 2.
Sample Input 2:
100
Sample Output 2:
10
Explanation of Sample Output 2:
The square root of the given number 100 is 10.
*/

// NOTE: since the input to work on will be sorted and we need to do a search on it, we should think of binary search
// Time Complexity : O(log(n))
// Space Complexity : O(1)
public class FindSquareRoot {

    public static int sqrtN(long N) {
		/*
		 * Write your code here
		 */
         if(N==0 || N==1)
         return (int)N;

         long low = 2;
         long high = N;

         while(low<=high){
             long mid = low + (high-low)/2;
             if(mid == N/mid){
                 return (int)mid;
             }else if(mid < N/mid){
                 low = mid + 1;
             }else
             high = mid - 1;
         }

         return (int)high;
	}
}
