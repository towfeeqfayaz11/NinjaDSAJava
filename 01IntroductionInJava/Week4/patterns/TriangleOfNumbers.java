/* 
Problem statement
Print the following pattern for the given number of rows.

Pattern for N = 4



The dots represent spaces.




Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
           1
          232
         34543
        4567654
       567898765
Sample Input 2:
4
Sample Output 2:
           1
          232
         34543
        4567654
 */

import java.util.Scanner;

public class TriangleOfNumbers {

	public static void main(String[] args) {
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for(int i=1; i<=N; i++){
			//spaces
			for(int j=i; j<N; j++){
				System.out.print(" ");
			}
			//numbers left
			for(int j=1; j<=i; j++ ){
				System.out.print(i+j-1);
			}

			//numbers right
			for(int j=1; j<i; j++){
				System.out.print(2*i-1-j);
			}

			System.out.println();
		}

		sc.close();
	}
}
