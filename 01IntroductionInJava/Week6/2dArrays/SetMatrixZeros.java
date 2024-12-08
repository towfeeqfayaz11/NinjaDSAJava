/*
Problem statement
You are given an N x M integer matrix. Your task is to modify this matrix in place so that if any cell contains the value 0, then all cells in the same row and column as that cell should also be set to 0.

Requirements:

If a cell in the matrix has the value 0, set all other cells in that cell's row and column to 0.
You should perform this modification in place (without using additional matrices).
You must do it in place.

For Example:

If the given grid is this:
[7, 19, 3]
[4, 21, 0]

Then the modified grid will be:
[7, 19, 0]
[0, 0,  0]
Detailed explanation ( Input/output format, Notes, Images )
Input Format:

The first line of the input contains a single integer ‘T’ representing the no. of test cases.

The first line of each test case contains two space-separated integers ‘N’ and ‘M’, denoting the no. of the rows and columns of the matrix.

The next 'N' lines will contain ‘M’ space separated integers representing the elements of the matrix.
Output Format:

For each test case, print the modified grid.

Print output of each test case in a separate line.
Note:

You are not required to print anything; it has already been taken care of. Just implement the function and return the answer.
Constraints:

1 ≤ T ≤ 1000
1 ≤ m, n ≤ 1000
Σ(m * n) ≤ 2000000
-2^(31) ≤ matrix[i][j] ≤ 2^(31)-1, for all (1 ≤ i ≤ n and 1 ≤ j ≤ m).

Time Limit: 1 sec
Follow up:

Can we do better than O(m * n) space?
Using O(m + n) space is an improvement but we can still do better.
We can do it using constant memory. Can you do it?
Sample Input 1 :
2
2 3
7 19 3
4 21 0
3 3
1 2 3
4 0 6
7 8 9
Sample Output 1 :
7 19 0
0 0 0
1 0 3
0 0 0
7 0 9
Explanation For Sample Input 1 :
For First Case - Similar to the example explained above. 

For Second Case - 
Only the cell (2,2) has zero. So all the elements of the second row and second column are changed to zeros.
Sample Input 2 :
2
4 2
1 0
2 7
3 0
4 8
3 3
0 2 3
1 0 3
1 2 0
Sample Output 2 :
0 0
2 0
0 0
4 0
0 0 0
0 0 0
0 0 0
*/


/*
Solution 1:

Time Complexity = O(n * m)
Space Complexity = O(n * m)
*/
public class SetMatrixZeros {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] marker = new int[n][m]; // marker array to mark all zeroes (defualt values are zero)

        //traverse array to mark all zeroes as -1 in marker array
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 0){
                    marker[i][j] = -1;
                }
            }
        }

        // traverse marker array to set all rows columns to zeros 
        // corresponding to given element
        int r,c;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(marker[i][j] == -1){
                    r = i;
                    c = 0;
                    while(c<m){
                        matrix[r][c++] = 0;
                    }

                    r = 0;
                    c = j;
                    while(r<n){
                        matrix[r++][c] = 0;
                    }

                }
            }

        }
    }
}


/*
Solution 2:
Time Complexity: O(N * M)
Space Complexity: O(1)
*/
    
class SetMatrixZeros2 {
    public static void setZeros(int matrix[][]) {
        int n=matrix.length;
        int m=matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        // check if first column needs to be zero
        for(int i=0; i<n; i++){
            if(matrix[i][0] == 0){
                firstColZero = true;
            }
        }

        // confirm if first row needs to be zero
        for(int j=0; j<m; j++){
            if(matrix[0][j] == 0){
                firstRowZero = true;
            }
        }

        // now since the state of first row and first col is saved, we can use these respective
        // first  row and first col as markers for rest of the array
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // update respective colums for each element based on marking
        for(int i=1; i<n ; i++){
            if(matrix[i][0] == 0){
                for(int j=1; j<m; j++){
                    matrix[i][j] = 0;
                }
            }
        }

        // update respective rows for each element based on marking
        for(int j=1; j<m; j++){
            if(matrix[0][j] == 0){
                for(int i=1; i<n; i++){
                    matrix[i][j] = 0;
                }
            }
        }


        // based on earlier marking for first row, check if entire row need to be marked zero
        if(firstRowZero){
            for(int j=0; j<m; j++){
                matrix[0][j] = 0;
            }
        }

        // based on earlier marking for first column, check if entrie col need to be marked zero
        if(firstColZero){
            for(int i=0; i<n; i++){
                matrix[i][0] = 0;
            }
        }

        
    }
}
