/*
Problem statement
Given two numbers, x, and y, calculate and Return their GCD.

GCD stands for "Greatest Common Divisor." It refers to the largest positive integer that divides two or more numbers without leaving a remainder. 
Detailed explanation ( Input/output format, Notes, Images )
Input format :
x and y (separated by space)
Output format :
GCD of x and y
Sample Input 1:
20 
5
Sample Output 1:
5
Sample Input 2:
96 
28
Sample Output 2:
4
Explanation :
One way to find the GCD is to use the prime factorization method:
Prime factorization of 96: 96 = 2*2*2*2*2*3
Prime factorization of 28: 28 = 2*2* 7
Common prime factors: 2*2
Therefore, the GCD of 96 and 28 is 4.
*/

public class GCD {
    public static int findGCD(int a, int b) {
        // write the logic 
        int temp;
        while(b != 0){
            temp = a;
            a = b;
            b = temp%b;
        }
        return a;
    }
}
