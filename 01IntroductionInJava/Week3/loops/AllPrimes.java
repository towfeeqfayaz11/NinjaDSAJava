package loops;
/*
Problem statement
Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).

Print the prime numbers in different lines.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= N <= 100
Sample Input 1:
9
Sample Output 1:
2
3
5
7
Sample Input 2:
20
Sample Output 2:
2
3
5
7
11
13
17
19
 */


 // method 1:
import java.util.Scanner;
public class AllPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        //handle 2 seperately(only even prime number)
        if(N>1){
            System.out.println(2);
        }
        
        //handle odd prime numbers seperately
        for(int i=3;i<=N;i+=2){
            boolean isPrime = true;
            for(int j=2; j*j<=i && isPrime;j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.println(i);
            }
        }

        sc.close();
    }
}

/*
// method 2
import java.util.Scanner;

public class AllPrimes {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for(int i=0; i<=N;i++){
			if(i*i == N){
				System.out.println(i);
				break;
			}else if(i*i > N){
				System.out.println(i-1);
				break;
			}
		}

	}
}
*/