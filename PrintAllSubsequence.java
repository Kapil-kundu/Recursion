import java.util.Scanner;
import java.util.ArrayList;

public class PrintAllSubsequence {

	private static void print(int index, int n, ArrayList<Integer> list, int[] arr) {
		if(index == n) {
			for(int x : list) {
				System.out.print(x + " ");
			}
			System.out.println();
			return ;
		}
		list.add(arr[index]);
		print(index + 1, n, list, arr);
		list.remove(list.size() - 1);
		print(index + 1, n, list, arr);
		
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		ArrayList<Integer> list = new ArrayList<>();
		print(0,n, list, arr);
	}
}
