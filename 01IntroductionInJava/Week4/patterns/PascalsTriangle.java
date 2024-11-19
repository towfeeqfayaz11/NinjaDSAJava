/*
Problem statement
You are given an integer N. Your task is to print the pascal’s triangle till the row N.

A Pascal's triangle is a triangular array constructed by summing adjacent elements in preceding rows. Pascal's triangle contains the values of the binomial coefficient. For example in the figure below.



For example, given integer N= 4 then you have to print.

1  
1 1 
1 2 1 
1 3 3 1

Here for the third row, you will see that the second element is the summation of the above two-row elements i.e. 2=1+1, and similarly for row three 3 = 1+2 and 3 = 1+2.
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= T <= 40
1 <= N <= 50

Time Limit: 1 sec
Sample Input 1 :
3
Sample Output 1:
  1 
 1 1 
1 2 1 
Sample Output 1 :
6
Sample Output 2 :
     1 
    1 1 
   1 2 1 
  1 3 3 1 
 1 4 6 4 1
1 5 10 10 5 1
 */

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        // write your code logic !!
            Scanner sc = new Scanner(System.in);
  
         int N = sc.nextInt();
  
         for(int r=1;r<=N;r++){
             //spaces
             for( int s=1;s<=N-r;s++){
                 System.out.print(" ");
             }
             // pascals triangle is the coefficient of binomial theorem
             //numbers
             int p=1;
             // System.out.print(p + " ");
             for(int c=1;c<=r;c++){
                 System.out.print(p + " ");
                 p = p * (r-c)/(c);
             }
  
             System.out.println();
         }
         sc.close();
 
     }
}
