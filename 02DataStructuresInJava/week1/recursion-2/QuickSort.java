/*
Problem statement
Given the 'start' and the 'end'' positions of the array 'input'. Your task is to sort the elements between 'start' and 'end' using quick sort.


Note :
Make changes in the input array itself.
Detailed explanation ( Input/output format, Notes, Images )
Input format :
Line 1 : Integer N i.e. Array size
Line 2 : Array elements (separated by space)
Output format :
Array elements in increasing order (separated by space)
Sample Input 1 :
6 
2 6 8 5 4 3
Sample Output 1 :
2 3 4 5 6 8
Sample Input 2 :
5
1 2 3 5 7
Sample Output 2 :
1 2 3 5 7 
Constraints :
1 <= N <= 10^3
0 <= input[i] <= 10^9
*/

// Solution1
public class QuickSort {
    public static void quickSort(int[] input, int startIndex, int endIndex) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
		 if(startIndex>=endIndex)
		 return;

		 int pivotIndex = pivot(input, startIndex, endIndex);

		 quickSort(input, startIndex, pivotIndex-1);
		 quickSort(input, pivotIndex+1, endIndex);
	}

	private static int pivot(int[] input, int startIndex, int endIndex){
		int c = 0;
		// find count of elements smaller than input[startIndex]
		for(int i=startIndex+1;i<=endIndex;i++){
			if(input[i] < input[startIndex])
			c++;
		}
		int pivotIndex = startIndex+c;
		// bring input[startIndex] to its correct position in array
		swap(input, startIndex, pivotIndex);

		while(startIndex < endIndex ){
			if(input[startIndex] < input[pivotIndex])
			startIndex++;
			else if(input[endIndex] >= input[pivotIndex])
			endIndex--;
			else
			swap(input, startIndex, endIndex);
		}

		return pivotIndex;
	}

	private static void swap(int[] input, int i, int j){
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}
}




// Solution2
class QuickSort2 {
	
	public static void quickSort(int[] input, int startIndex, int endIndex) {
		// there is no element or only single element to sort, then return
		if(startIndex >= endIndex)
			return;

		int pivotIndex = getPivot(input, startIndex, endIndex);

		quickSort(input, startIndex, pivotIndex-1);
		quickSort(input, pivotIndex+1, endIndex);
	}

	public static int getPivot(int[] input, int startIndex, int endIndex){
		// asume element at startIndex to be our pivot
		int pivot = input[startIndex];
		int count = 0;
		// count element less than pivot
		for(int i=startIndex+1; i<=endIndex; i++){
			if(input[i] < pivot)
				count++;
		}
		//calculate pivotIndex
		int pivotIndex = startIndex+count;

		// move pivot element to its correct position
		swap(input, startIndex, pivotIndex);

		// move element smaller than pivot to left and larger than pivot to right
		while(startIndex < endIndex){
			if(input[startIndex] < input[pivotIndex])
				startIndex++;
			else if(input[pivotIndex] <= input[endIndex])
				endIndex--;
			else{
				swap(input, startIndex, endIndex);
			}
		}
		// now since all elements on left of pivot are small and on right are greater or equal, return pivotIndex
		return pivotIndex;
	}

	public static void swap(int[] input, int currIndex, int swapIndex){
		int temp = input[currIndex];
		input[currIndex] = input[swapIndex];
		input[swapIndex] = temp;
	}
	
}