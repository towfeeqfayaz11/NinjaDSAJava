package loops;
/*
Problem statement
Given a binary number as an integer N, convert it into decimal and print.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12
Sample Input 2 :
111
Sample Output 2 :
7
 */

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int number = 0;
		int pace_value = 1;
		while(N>0){
			int digit = N%10;
			number += digit*pace_value;
			pace_value*=2;
			N=N/10;
		}
		System.out.println(number);

        sc.close();
    }
}
