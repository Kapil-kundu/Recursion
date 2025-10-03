import java.util.Scanner;
import java.util.ArrayList;

public class SubsequencesWhoseSumIsK {

	private static void sumIsK(int ind, int k, int n, int sum, ArrayList<Integer> list, int[] arr) {
		if(ind == n) {
			if(sum == k) {
				for(int i = 0; i < list.size(); i++) {
					System.out.print(list.get(i) + " ");
				}
				System.out.println();
			}
			return;
		}
		
		list.add(arr[ind]);
		k += arr[ind];
		sumIsK(ind + 1, k, n, sum, list, arr);
		
		list.remove(list.size() - 1);
		k -= arr[ind];
		
		sumIsK(ind + 1, k, n, sum, list, arr);
	}

		
		
	public static void main(String[] arsg) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter K(sum) : ");
		int k = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		sumIsK(0, 0, n, k, list, arr);
	}
}
