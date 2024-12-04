/*
Problem statement
You are having a character array (arr) containing ASCII characters. You are required to reverse the character array (arr) and return it as a string.

You must do this by modifying the input array.

Output the reverse of the input array.

Example :
S = “hello”

Explanation : 

The reverse of the input array is “olleh”.
Detailed explanation ( Input/output format, Notes, Images )
Input Format :
The first line contains an integer 'T' which denotes the number of test cases to be run. Then the test cases follow.

The only line of each test case contains an array.
Output format :
For each test case, print a string denoting the reverse of the array ‘arr’.

Print the output of each test case in a new line.
Note :
You don’t need to print anything. It has already been taken care of. Just implement the given function.
Constraints :
1 <= T <= 5
1 <= S.length <= 10^5

Time Limit : 1 sec
Sample Input 1 :
2
ninja
MoM
Sample Output 1 :
ajnin
MoM
Explanation Of Sample Input 1 :
For test case 1 we have, 

The reverse of “ninja” is “ajnin”.

So, we output “ajnin” ( without quotes ).

For test case 2 we have, 

The reverse of “MoM” is “MoM” as it is a palindrome.

So, we output “MoM”.
Sample Input 2 :
2
ggUM
Kzk
Sample Output 2 :
MUgg
kzK
*/

public class StringReverse {

  public static String stringReverse(char[] arr) {
    // Write your code here.
    int i = 0, j=arr.length-1;
    char temp;
    while(i<j){
      temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;

      i++;
      j--;
    }

    return new String(arr);
  }
}


//solution 2
class StringReverse2 {

    public static String stringReverse(String str) {
      // Write your code here.

      String revString = "";

      // approach 1
      for(int i=str.length()-1; i>=0; i--){
        revString = revString + str.charAt(i);
      }

      //approach 2
    //   for(int i=1; i<str.length(); i++){
    //     revString = str.charAt(i)+revString;
    //   }

    return revString;
    }
  }
