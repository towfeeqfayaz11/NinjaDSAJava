/*
Problem statement
Print the following pattern for the given number of rows.

Note: N is always odd.
Pattern for N = 5
The dots represent spaces.


Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= N <= 49
Sample Input 1:
5
Sample Output 1:
  *
 ***
*****
 ***
  *
Sample Input 2:
3
Sample Output 2:
  *
 ***
  *

        //upper half
        for(int r=1;r<=bisect;r++){
            //spaces
            for(int s=1;s<=bisect-r;s++){
                System.out.print(" ");
            }

            //stars
            for(int c=1;c<=2*r-1;c++){


 */

import java.util.Scanner;

public class DiamondOfStars {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int bisect = (N/2)+1;

        //upper half
        for(int r=1;r<=bisect;r++){
            //spaces
            for(int s=1;s<=bisect-r;s++){
                System.out.print(" ");
            }

            //stars
            for(int c=1;c<=2*r-1;c++){
                System.out.print("*");
            }

            System.out.println();
        }

        //lower half
        for(int r=bisect-1;r>=1;r--){
            //spaces
            for(int s=1;s<=bisect-r;s++){
                System.out.print(" ");
            }

            //stars
            for(int c=1;c<=2*r-1;c++){
                System.out.print("*");
            }

            System.out.println();
        }


        
    }
}
