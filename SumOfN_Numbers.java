import java.util.Scanner;

public class SumOfN_Numbers{
	private static void sum(int n, int total) {
		if(n == 0) {
			System.out.println(total);
			return;
		}
		sum(n - 1, total + n);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int total = 0;
		sum(n, total);
	}
}
