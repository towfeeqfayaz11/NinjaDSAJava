/*
Problem statement
You are given a two-dimensional square matrix of size N×N. You need to find the sum of the elements on:

The main diagonal (from the top-left corner to the bottom-right corner).
The secondary diagonal (from the top-right corner to the bottom-left corner).
All the boundary elements of the matrix
Make sure that no element is counted more than once, even if it belongs to both diagonals or is a boundary element. Your task is to compute the sum of all these unique elements.

Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= t <= 10^2
0 <= N <= 10^3
Time Limit: 1sec
Sample input 1:
1
3
1 2 3
4 5 6
7 8 9
Sample Output 1:
45
Explanation for Sample Output 1:
The boundary elements are 1, 2, 3, 6, 9, 8, 7 and 4. 

The first-diagonal elements are 1, 5 and 9. 

The second-diagonal elements are 3, 5 and 7.

We just need to add all these numbers making sure that no number is added twice. For example, '1' is both a boundary element and a first-diagonal element similarly, '5' contributes to both the diagonals but they won't be added twice.

Hence, we add up, [1 + 2 + 3 + 6 + 9 + 8 + 7 + 4 + 5] to give 45 as the output.
Sample input 2:
2
5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
4
1 2 3 10
4 5 6 11
7 8 9 12
13 14 15 16
Sample Output 2:
273
136
*/
public class MatrixBoundaryDiagnolSum {
    public static void totalSum(int[][] mat) {
		//Your code goes here

		int n = mat.length;
		if(n == 0){
			System.out.println(n);
			return;
		}

		int i=0;
		int j=n-1;

		int diag1_sum=0,diag2_sum=0;

		// sum of both diagonal elements
		while(i<n){
			diag1_sum += mat[i][i];
			if(i!=j)
			diag2_sum += mat[i][j];
			i++;
			j--;
		}

		int top_left=0, bottom_right=0;
		//sum of edge elements (top and left)
		int r = 0;
		for(int c = 1;c<n-1;c++){
			top_left += mat[r][c];
			top_left += mat[c][r];
		}

		//sum of edge elements (bottom and right)
		int c = n-1;
		for(r = 1;r<n-1;r++){
			bottom_right += mat[r][c];
			bottom_right += mat[c][r];
		}

		System.out.println(diag1_sum + diag2_sum + top_left + bottom_right);
	}

}
