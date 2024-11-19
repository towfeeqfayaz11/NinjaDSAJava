/*
Problem statement
Print the following pattern for the given number of rows.

Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
Detailed explanation ( Input/output format, Notes, Images )
Constraints
0 <= N <= 26
Sample Input 1:
8
Sample Output 1:
H
GH
FGH
EFGH
DEFGH
CDEFGH
BCDEFGH
ABCDEFGH
Sample Input 2:
7
Sample Output 2:
G
FG
EFG
DEFG
CDEFG
BCDEFG
ABCDEFG
*/
import java.util.Scanner;

// solution1
public class InterestingAlphabets {
    public static void main(String[] args) {
		//Your code goes here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for(int i=N; i>=1;i--){
			for(int j=i;j<=N;j++){
				System.out.print((char)('A' + j-1));
			}
			System.out.println();
		}
	}
}

// solution2
/*
public class InterestingAlphabets {
	public static void main(String[] args) {
		//Your code goes here

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for(int r=1;r<=N;r++){
			char p = (char)('A' + N - r);
			for(int c=1;c<=r;c++){
				System.out.print(p);
				p = (char)(p+1);
			}
			System.out.println();
		}
	}
}
*/