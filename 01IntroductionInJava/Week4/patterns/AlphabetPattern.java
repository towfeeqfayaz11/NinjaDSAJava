/*
Problem statement
Print the following pattern for the given N number of rows.

Pattern for N = 3
AAA
BBB
CCC
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
10 <= N <= 50
Sample Input 1:
4
Sample Output 1:
AAAA
BBBB
CCCC
DDDD
Sample Input 2:
5  
Sample Output 2:
AAAAA
BBBBB
CCCCC
DDDDD
EEEEE
 */

import java.util.Scanner;
public class AlphabetPattern {
	public static void main(String[] args) 
	{
	 // write your code logic here !!
	 Scanner sc = new Scanner(System.in);
	 int N = sc.nextInt();

	 for(int i=0;i<N;i++){
		 for(int j=0;j<N;j++){
			 System.out.print((char)('A'+i));
		 }
		 System.out.println();
	 }
    }
}
