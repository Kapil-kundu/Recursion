import java.util.Scanner;

public class Fibonacci {

	private static long find(int n) {
		if(n < 2) {
			return n;
		}
		long  last = find(n - 1);
		long slast = find(n - 2);
		return last + slast;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(find(n));
		
		
		/*
			We can also find fibonacci using DP(Dynamic programming)
				
		long prev = 1;
		long sprev = 0;
		long ans = 0;
		for(int i = 2; i < n + 1; i++) {
			ans = prev + sprev;
			sprev = prev;
			prev = ans;
		}
		System.out.println(ans);
		
		*/
		
	}
}
