/*
Problem statement
Write a recursive function that returns the sum of the digits of a given integer.

Detailed explanation ( Input/output format, Notes, Images )
Input format :
Integer N
Output format :
Sum of digits of N
Constraints :
0 <= N <= 10^9
Sample Input 1 :
12345
Sample Output 1 :
15
Sample Input 2 :
9
Sample Output 2 :

*/
public class SumOfDigitsRecursive {
    public static int sumOfDigits(int input){
		// Write your code here
		if(input == 0)
		return 0;

		int digit = input%10;
		int smallAns = sumOfDigits(input/10);

		return digit + smallAns;

	}
}
