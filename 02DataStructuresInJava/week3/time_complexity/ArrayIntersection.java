/*
Problem statement
You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their
intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value
or to put it in other words, when there is a common value that exists in both the arrays/lists.

Note :
Input arrays/lists can contain duplicate elements.

The intersection elements printed would be in ascending order.


Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^4
0 <= M <= 10^4

Time Limit: 1 sec 
Sample Input 1 :
2
6
2 6 8 5 4 3
4
2 3 4 7 
2
10 10
1
10
Sample Output 1 :
2 3 4
10
Sample Input 2 :
1
4
2 6 1 2
5
1 2 3 4 2
Sample Output 2 :
1 2 2
Explanation for Sample Output 2 :
Since, both input arrays have two '2's, the intersection of the arrays also have two '2's. The first '2' of first
array matches with the first '2' of the second array. Similarly, the second '2' of the first array matches with
the second '2' if the second array.
*/
public class ArrayIntersection {
    public static void intersection(int[] arr1, int[] arr2) {
	    //Your code goes here
		mergeSort(arr1, 0, arr1.length-1);
		mergeSort(arr2, 0, arr2.length-1);

		int i=0,j=0;
		while(i<arr1.length && j<arr2.length){
			if(arr1[i] == arr2[j]){
				System.out.print(arr1[i] + " ");
				i++;
				j++;
			}else if(arr1[i]<arr2[j])
				i++;
			else
			j++;
		}
	}

	private static void mergeSort(int[] arr, int l, int r){
        // Write your code here
        if(l>=r){
            return;
        }
        int[] s1 = new int[(r+1)/2];
        int[] s2 = new int[(r+1) - s1.length];

        for(int i=0; i<(r+1)/2; i++){
            s1[i] = arr[i];
        }
        for(int i=(r+1)/2;i<=r; i++){
            s2[i-(r+1)/2] = arr[i];
        }
        
        mergeSort(s1, 0, s1.length-1);
        mergeSort(s2, 0,s2.length-1);

        merge(arr, s1, s2);
    }

    private static void merge(int[] arr,  int[] s1, int[] s2){
        int i=0,j=0, k=0;
        while(i<s1.length && j<s2.length){
            if(s1[i]<s2[j])
            arr[k++] = s1[i++];
            else
            arr[k++] = s2[j++];
        }

        while(i<s1.length){
            arr[k++] = s1[i++];
        }

        while(j<s2.length){
            arr[k++] = s2[j++];
        }

    }
}
