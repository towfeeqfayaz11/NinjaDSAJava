/*
Problem statement
You are given an array A of size N.

You are also given an integer X and a direction DIR. You need to rotate the array A by X positions in the direction specified by DIR.

DIR can be:

'LEFT': Rotate the array to the left by X positions.
'RIGHT': Rotate the array to the right by X positions.
Return the resulting rotated array.

For example:

Input :
A = [6, 2, 6, 1], X = 1, DIR = ‘LEFT’

Output :
2 6 1 6

Explanation: Rotate array ‘A’ to the left one time.
[6, 2, 6, 1] => [2, 6, 1, 6]
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= T <= 10
1 <= N <= 10^5 
1 <= X <= 10^9
‘DIR’ is an element of {‘LEFT’, ‘RIGHT’}
Time Limit: 1 sec
Sample Input 1 :
2
4 1 LEFT
1 2 3 4
6 2 RIGHT
1 2 4 3 5 6 
Sample Output 1 :
2 3 4 1
5 6 1 2 4 3
Explanation Of Sample Input 1 :
For test case one:

Input :
A = [1, 2, 3, 4], X = 1, DIR = ‘LEFT’

Output :
2 3 4 1

Explanation: Rotate array ‘A’ to the left one time.
[1, 2, 3, 4] => [2, 3, 4, 1]

For test case two:

Input :
A = [1, 2, 4, 3, 5, 6], X = 2, DIR = ‘RIGHT’

Output :
5 6 1 2 4 3

Explanation: Rotate array ‘A’ to the right one time.
[1, 2, 4, 3, 5, 6] => [6, 1, 2, 4, 3, 5]
Sample Input 2 :
2
6 3 LEFT
22 8 4 7 5 10
6 2 RIGHT
9 3 1 6 3 9
Sample Output 2 :
7 5 10 22 8 4 
3 9 9 3 1 6  
*/



public class ArrayRotation {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8};
        int dir = 1; // 1 for clockwise/right rotation, 0 for anti-clockwise/left rotation
        int pos = 2; //number of points to rotate


        System.out.printf("rotating array in right direction by (%d) positions\n", pos);
        for(int i = 0; i < arr1.length; i++){
            System.out.println(i + "->)" + arr1[i]);
        }

        int[] arr2 = rotateArrayByXPositions(arr1, dir, pos);
        System.out.println("------------");

        for(int i = 0; i < arr2.length; i++){
            System.out.println(i + "->)" + arr2[i]);
        }

    }
    public static int[] rotateArrayByXPositions(int[] arr1, int dir, int pos){
        int[] arr2 = new int[arr1.length];

        if(dir == 1){
            for(int i=0; i<arr2.length; i++){
                arr2[(i+pos)%arr2.length] = arr1[i];
            }
        }else{
            for(int i=0; i<arr2.length; i++){
                arr2[(i-pos+arr2.length)%arr2.length] = arr1[i];
            }
        }

        return arr2;
    }

}

/*
Approach 2:

Time Complexity: O(n)
Space Complexity: O(1)
*/

class ArrayRotation2 {
    public static int[] rotateArray(int []a, int x, String dir) {
        // Write your code here.
        // taking modulo to make sure x is not going out of bound
        x = (x%a.length);

        if(dir.equals("RIGHT")){
            // right rotation

            // reverse whole array
            reverseArr(a, 0, a.length-1);
            // revers 0 to x-1
            reverseArr(a, 0, x-1);
            // reverse x to length-1
            reverseArr(a, x, a.length-1);
        }else{
            // left rotation

            // reverse whole array
            reverseArr(a, 0, a.length-1);
            // revers 0 to length-x-1
            reverseArr(a, 0, a.length-x-1);
            // revers length-x to length-1
            reverseArr(a, a.length-x, a.length-1);
        }

        return a;
    }

    public static void reverseArr(int[] a, int l, int r){
        int temp;
        while(l<r){
            temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }
}


/*
Approach 3:
Time Complexity: O(n)
Space Complexity: O(n)
*/
class ArrayRotation3 {
    public static int[] rotateArray(int []a, int x, String dir) {
        x = x % a.length;
        int[] b = new int[a.length];
        int j = 0;
        if(dir.equals("RIGHT")){
            // first move length-x to length-1 elements from a to start of b
            for(int i=a.length-x;i<a.length;i++){
                b[j++] = a[i];
            }
            // now move 0 to length-x-1 elements from a to end of b
            for(int i=0;i<a.length-x;i++){
                b[j++] = a[i];
            }
        }else{
            // first move x to length-1 element
            for(int i=x;i<a.length;i++){
                b[j++] = a[i];
            }

            // now move 0 to x-1 elements from a to end of b
            for(int i=0;i<x;i++){
                b[j++] = a[i];
            }
        }

        return b;
    }
}