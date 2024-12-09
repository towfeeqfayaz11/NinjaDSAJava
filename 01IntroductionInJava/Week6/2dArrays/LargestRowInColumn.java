/*
Problem statement
You are given a 2D list (array) with dimensions N rows and M columns, filled with integers. Your task is to find the row or column that has the largest sum of its elements.

Important Rules:
- If two or more rows/columns have the same sum, choose the one that comes first.
- If a row and a column have the same largest sum, choose the row.
Goal: Return which row or column has the largest sum.

Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= t <= 10^2
1 <= N <= 10^3
1 <= M <= 10^3
Time Limit: 1sec
Sample Input 1:
1
3 2
6 9 
8 5 
9 2 
Sample Output 1:
column 0 23
Sample Input 2:
1
4 4
6 9 8 5 
9 2 4 1 
8 3 9 3 
8 7 8 6 
Sample Output 2:
column 0 31
*/
public class LargestRowInColumn {
    public static void findLargest(int mat[][]){
		//Your code goes here
		int col=0,row=0;
		int col_sum=Integer.MIN_VALUE, row_sum=Integer.MIN_VALUE;

		int n = mat.length;
		if(n==0){
			System.out.println("row " + row  + " " + row_sum);
			return;
		}
		int m = mat[0].length;

		// find max row sum
		for(int i=0;i<n;i++){
			int sum=0;
			for(int j=0;j<m;j++){
				sum+=mat[i][j];
			}
			if(sum>row_sum){
				row_sum=sum;
				row=i;
			}
		}


		// find max col sum
		for(int i=0;i<m;i++){
			int sum=0;
			for(int j=0;j<n;j++){
				sum+=mat[j][i];
			}
			if(sum>col_sum){
				col_sum=sum;
				col=i;
			}
		}

		if(row_sum >= col_sum)
		System.out.println("row " + row  + " " + row_sum);
		else
		System.out.println("column " + col  + " " + col_sum);
	}
}
