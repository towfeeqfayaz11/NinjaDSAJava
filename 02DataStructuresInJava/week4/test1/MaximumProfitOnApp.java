/*
Problem statement
You have made a smartphone app and want to set its subscription price such that the profit earned is maximised. There are certain users who will subscribe to your app only if their budget is greater than or equal to your price.

You will be provided with a list of size N having budgets of subscribers and you need to return the maximum profit that you can earn.

Lets say you decide that price of your app is Rs. x and there are N number of subscribers. So maximum profit you can earn is :

 m * x
where m is total number of subscribers whose budget is greater than or equal to x.

Detailed explanation ( Input/output format, Notes, Images )
Input format :
Line 1 : N (No. of subscribers)
Line 2 : Budget of subscribers (separated by space)
Output Format :
 Maximum profit
Constraints :
1 <= N <= 10^6

1 <=budget[i]<=9999

Sample Input 1 :
4
30 20 53 14
Sample Output 1 :
60
Sample Output 1 Explanation :
Price of your app should be Rs. 20 or Rs. 30. For both prices, you can get the profit Rs. 60.
Sample Input 2 :
5
34 78 90 15 67
Sample Output 2 :
201
Sample Output 2 Explanation :
Price of your app should be Rs. 67. You can get the profit Rs. 201 (i.e. 3 * 67).
*/

public class MaximumProfitOnApp {
    public static int maximumProfit(int budget[]) {
		// Write your code here
		int n = budget.length;
		mergeSort(budget, 0, n-1);
		int max = Integer.MIN_VALUE;
		int temp;
		for(int i=0;i<budget.length;i++){
			temp = budget[i] * n;
			if(temp>max){
				max = temp;
			}
			n--;
		}

		return max;

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
