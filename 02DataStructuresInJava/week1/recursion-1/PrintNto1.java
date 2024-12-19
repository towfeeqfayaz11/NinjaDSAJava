public class PrintNto1 {
    public static void print(int n){
		//Write your code here
		if(n == 0)
		return;

		System.out.print(n + " ");

        print(n-1);
	}
}
