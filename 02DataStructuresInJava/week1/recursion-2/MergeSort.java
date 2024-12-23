/*
Problem statement
You are given the starting 'l' and the ending 'r' positions of the array 'ARR'.

You must sort the elements between 'l' and 'r'.

Note:
Change in the input array itself. So no need to return or print anything.
Example:
Input: ‘N’ = 7,
'ARR' = [2, 13, 4, 1, 3, 6, 28]

Output: [1 2 3 4 6 13 28]
Detailed explanation ( Input/output format, Notes, Images )
Input format :
The first line contains an integer <em>**'N'**</em> representing the size of the array/list.

The second line contains 'N' single space-separated integers representing the elements in the array/list.
Output format :
You don't need to return anything. In the output, you will see the array after you do the modification.
Sample Input 1:
7
2 13 4 1 3 6 28
Sample Output 1:
1 2 3 4 6 13 28
Explanation of Sample Output 1:
After applying 'merge sort' on the input array, the output is [1 2 3 4 6 13 28].
Sample Input 2:
5
9 3 6 2 0
Sample Output 2:
0 2 3 6 9
Explanation of Sample Output 2:
After applying 'merge sort' on the input array, the output is [0 2 3 6 9].
Constraints :
1 <= N <= 10^3
0 <= ARR[i] <= 10^9
*/

// Approach 1
public class MergeSort {
    public static void mergeSort(int[] arr, int l, int r){
        // Write your code here
        if(l>=r){
            return;
        }
        int[] s1 = new int[arr.length/2];
        int[] s2 = new int[arr.length - s1.length];

        for(int i=0; i<arr.length/2; i++){
            s1[i] = arr[i];
        }
        for(int i=arr.length/2;i<=r; i++){
            s2[i-(arr.length)/2] = arr[i];
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


// Approach two
class MergeSort2 {
    public static void mergeSort(int[] arr, int l, int r){
        // Write your code here
        if(l<r){
            int mid = (l + r)/2; // ~= l + (r-l)/2
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);

            merge(arr, l, mid, r);
        }
    }

    public static void merge(int[] arr, int l, int mid, int r){
        // stores number of elements in first half
        int n1 = mid-l+1;
        // stores number of elements in 2nd half
        int n2 = r-mid;

        // creating two temporay arrays of size n1 and n2
        int[] L = new int[n1];
        int[] R = new int [n2];

        // copy data to temporary arrays
        for(int i=0; i<n1; i++){
            L[i] = arr[l+i];
        } 

        for(int j=0; j<n2; j++){
            R[j] = arr[mid+1+j];
        }

        // merge two temporary arrays back to arr[l..r]
        int i=0, j=0, k=l;
        while(i<n1 && j<n2){
            if(L[i] < R[j]){
                arr[k++] = L[i++];
            }else{
                arr[k++] = R[j++];
            }
        }

        // copy remaining elements from L (if any) to arr
        while(i<n1){
            arr[k++] = L[i++];
        }

        // copy remaining elements from R (if any) to arr
        while(j<n2){
            arr[k++] = R[j++];
        }
    }
}