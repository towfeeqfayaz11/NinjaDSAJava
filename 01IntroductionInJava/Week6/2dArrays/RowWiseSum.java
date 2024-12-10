/*
First line of each test case or query contains two integer values, 'N' and 'M', separated
by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.

Second line onwards, the next 'N' lines or rows represent the ith row values.

Each of the ith row constitutes 'M' column values separated by a single space.
Output Format :
For each test case, print the sum of every ith row elements in a single line separated by a single space.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
0 <= M <= 10^3
Time Limit: 1sec
Sample Input 1:
1
4 2 
1 2 
3 4 
5 6 
7 8


Sample Output 1:
3 7 11 15 
Sample Input 2:
2
2 5 
4 5 3 2 6 
7 5 3 8 9


4 4
1 2 3 4
9 8 7 6
3 4 5 6
-1 1 -10 5


Sample Output 2:
20 32 
10 30 18 -5
*/
public class RowWiseSum {
    public static void rowWiseSum(int[][] mat) {
        int n = mat.length;
        if (n == 0) {
            return;
        }
        int m = mat[0].length;

        // one check need to be added here as well if m is 0
        if(m ==0)
        return;

        //int sum = 0; // small issue I see here is if sum overflow because of huge value(so change from int to long)
        long sum =0;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < m; j++) {
                sum += mat[i][j];
            }
            System.out.print(sum + " ");
        }
		System.out.println();
    }
}
