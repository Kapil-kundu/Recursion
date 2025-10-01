import java.util.Scanner;

public class ReversingArray{
	private static void reverse(int l, int r, int[] arr) {
		if(l > r) {
			return;
		} 
		int temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
		
		l = l + 1;
		r = r - 1;
		reverse(l, r, arr);
	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int l = 0;
		int r = n - 1;
		reverse(l, r, arr);
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
	
