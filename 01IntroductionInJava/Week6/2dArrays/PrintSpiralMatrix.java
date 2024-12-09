/*
Problem statement
For a given two-dimensional integer array/list of size (N x M), print it in a spiral form. That is, you need to print in the order followed for every iteration:

a. First row(left to right)
b. Last column(top to bottom)
c. Last row(right to left)
d. First column(bottom to top)
 Mind that every element will be printed only once.

Refer to the Image:
Spiral path of a matrix

Detailed explanation ( Input/output format, Notes, Images )
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.

Second line onwards, the next 'N' lines or rows represent the ith row values.

Each of the ith row constitutes 'M' column values separated by a single space.
Output format :
For each test case, print the elements of the two-dimensional array/list in the spiral form in a single line, separated by a single space.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
0 <= M <= 10^3
Time Limit: 1sec
Sample Input 1:
1
4 4 
1 2 3 4 
5 6 7 8 
9 10 11 12 
13 14 15 16
Sample Output 1:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
Sample Input 2:
2
3 3 
1 2 3 
4 5 6 
7 8 9
3 1
10
20
30
Sample Output 2:
1 2 3 6 9 8 7 4 5 
10 20 30
*/
public class PrintSpiralMatrix {
    public static void spiralPrint(int matrix[][]){
		int top = 0, left = 0;
		int bottom = matrix.length-1;
		if(bottom == -1) // empty matrix
			return;
		int right = matrix[0].length-1;

		int totalElements = matrix.length * matrix[0].length;

		while(totalElements > 0){
			// from top, print left to right (top row traversal)
			for(int i=left; i<=right; i++){
				System.out.print(matrix[top][i] + " ");
				totalElements--;
			}
			if(totalElements == 0)
				break;
			top++;

			// from right, print top to bottom (right column traversal)
			for(int i=top; i<=bottom; i++){
				System.out.print(matrix[i][right] + " ");
				totalElements--;
			}
			if(totalElements == 0)
				break;
			right--;

			// from bottom, print right to left (bottom row traversal)
			for(int i=right; i>=left; i--){
				System.out.print(matrix[bottom][i] + " ");
				totalElements--;
			}
			if(totalElements == 0)
				break;
			bottom--;

			// from left, print bottom to top (left column traversal)
			for(int i=bottom; i>=top; i--){
				System.out.print(matrix[i][left] + " ");
				totalElements--;
			}
			if(totalElements == 0)
				break;
			left++;
		}
	}
}
