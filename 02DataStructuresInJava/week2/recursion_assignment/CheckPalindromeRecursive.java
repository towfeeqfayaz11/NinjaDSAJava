/*
Problem statement
Determine if a given string ‘S’ is a palindrome using recursion. Return a Boolean value of true if it is a palindrome and false if it is not.

Note: You are not required to print anything, just implement the function. Example:
Input: s = "racecar"
Output: true
Explanation: "racecar" is a palindrome.
Detailed explanation ( Input/output format, Notes, Images )
Input Format:
The first and only line of the input contains string S.
Output format:
Return a boolean value True or False.
Sample Input 1:
abbba
Sample Output 1:
true
Explanation Of Sample Input 1 :
“abbba” is a palindrome
Sample Input 2:
abcd
Sample Output 2:
false
Explanation Of Sample Input 2 :
“abcd” is not a palindrome.
Constraints:
0 <= |S| <= 10^6
where |S| represents the length of string S.
*/
public class CheckPalindromeRecursive {
    public static boolean isPalindrome(String str) {
        // Write your code here.
        return isPalindromeHelper(str, 0, str.length()-1);
    }

    private static boolean isPalindromeHelper(String str, int si, int ei){
        if(si>=ei){
            return true;
        }

        if(str.charAt(si) != str.charAt(ei)){
            return false;
        }

        return isPalindromeHelper(str, si+1, ei-1);
    }
}
