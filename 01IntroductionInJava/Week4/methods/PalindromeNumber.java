
/*
Problem statement
Check whether a given number ’n’ is a palindrome number.

Note :
Palindrome numbers are the numbers that don't change when reversed.
You don’t need to print anything. Just implement the given function.
Example:
Input: 'n' = 51415
Output: true
Explanation: On reversing, 51415 gives 51415.
Detailed explanation ( Input/output format, Notes, Images )
Input Format:
The first and only line of the input contains the number 'n'.
Output format:
Return a boolean value True or False.
Sample Input 1 :
1032
Sample Output 1 :
false
Explanation Of Sample Input 1:
1032, on being reversed, gives 2301, which is a totally different number.
Sample Input 2 :
121
Sample Output 2 :
true
Explanation Of Sample Input 2:
121, on being reversed, gives 121, which is the same.
Expected time complexity:
The expected time complexity is O(log(n)).
Constraints :
1 <= n <= 10^9
Time Limit: 1 sec
*/
public class PalindromeNumber {
    public static boolean palindromeNumber(int n){
        // Write your code here.
        int reverse = calculateReverse(n);
        if(reverse == n){
            return true;
        }
        return false;


    }

    public static int calculateReverse(int n) {
        int reverse = 0;
        while(n !=0){
            int digit = n%10;
            reverse = reverse * 10 + digit;
            n = n/10 ;
        }

        return reverse;
    }
}
