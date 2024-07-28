// Identify Triangle:

/*
Problem statement
Given three positive integers as X, Y and Z representing three sides of a triangle, write a program
that determines whether the triangle formed by the sides exist or not. If the triangle exists,
classify it as isosceles, scalene or equilateral.

Condition for valid Triangle:
Sum of any two of its sides should be greater than the third side


Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1<=X,Y,Z<=10^5
Sample Input 1:
3
4
5
Sample Output 1:
Scalene Triangle
Explanation
As all three sides are different, so triangle is scalene.
Sample Input 2:
2
7
9
Sample Output 2:
Not a Triangle

*/

import java.util.*;

public class IdentityTriangle {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();

		boolean isValid = false;
		if((X+Y)>Z && (Y+Z)>X && (Z+X)>Y){
			isValid = true;
		}

		if(isValid){
			if(X==Y && Y==Z){
				System.out.println("Equilateral Triangle");
			}else if(X==Y || Y==Z || X==Z){
				System.out.println("Isosceles Triangle");
			}else{
				System.out.println("Scalene Triangle");
			}
		}else{
			System.out.println("Not a Triangle");
		}

        sc.close();
    }
}