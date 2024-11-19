/*
Problem statement
You are given an integer N and you have to print the following pattern.

For N=5:
1 2 3 4 5 
 2 3 4 5 
  3 4 5 
   4 5 
    5 
   4 5 
  3 4 5 
 2 3 4 5 
1 2 3 4 5

For N=6:
1 2 3 4 5 6 
 2 3 4 5 6 
  3 4 5 6 
   4 5 6 
    5 6 
     6 
    5 6 
   4 5 6 
  3 4 5 6 
 2 3 4 5 6 
1 2 3 4 5 6

Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= N <= 50
Time Limit: 1 second
 */
import java.util.Scanner;

//solution 1 using while loop
public class HourGlassOfNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();

        //upper part of hour glass
        int i = 1;
        while(i <= n){

            //upper spaces
            int j=1;
            while(j<i){
                System.out.print(' ');
                j++;
            }

            //upper numbers
            int k=i;
            while(k<=n){
                System.out.print(k + " ");
                k++;
            }

            System.out.println();
            i++;
        }

        //lower part of hour glass
        i = n-1;
        while(i >=1){

            //lower spaces
            int j=1;
            while(j<i){
                System.out.print(' ');
                j++;
            }

            //lower numbers
            int k=i;
            while(k<=n){
                System.out.print(k + " ");
                k++;
            }
            
            System.out.println();
            i--;
        }
    }
}


// solution2 using for loop
/*
public class HourGlassOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

        //Write your code here
        for(int r=1;r<=N;r++){
            //spaces
            for(int s=1;s<=r-1;s++){
                System.out.print(" ");
            }

            //number
            for(int c=r;c<=N;c++){
                System.out.print(c+" ");
            }

            System.out.println();
        }

        for(int r=N-1;r>=1;r--){
            //spaces
            for(int s=1;s<=r-1;s++){
                System.out.print(" ");
            }

            //number
            for(int c=r;c<=N;c++){
                System.out.print(c+" ");
            }

            System.out.println();

        }
    }
}
*/