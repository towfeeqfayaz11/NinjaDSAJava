/*
Problem statement
Print the following pattern for the given N number of rows.

Pattern for N = 4
4 3 2 1
3 2 1
2 1
1
2 1
3 2 1
4 3 2 1 
Detailed explanation ( Input/output format, Notes, Images )
Constraints
0 <= N <= 50
Sample Input 1:
1
Sample Output 1:
1   
Sample Input 1:
3
Sample Output 1:
3 2 1 
2 1 
1
2 1 
3 2 1
*/

import java.util.Scanner;

public class FilledKShape {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for(int i=1;i<=N;i++){
			for(int j=N+1-i;j>=1;j--){
				System.out.print(j + " ");
			}

			System.out.println();
		}

		for(int i=N-1;i>=1;i--){
			for(int j=N+1-i;j>=1;j--){
				System.out.print(j + " ");
			}
			System.out.println();
		}

		
	}

}
