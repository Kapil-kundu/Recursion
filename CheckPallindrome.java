import java.util.Scanner;


public class CheckPallindrome {

	private static boolean check(int l, int r, String str) {
		if(l > r) {
			return true;
		}
		if(str.charAt(l) != str.charAt(r)) {
			return false;
		} 
		l = l + 1;
		r = r - 1;
		return check(l,r,str);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int l = 0;
		int r = str.length() - 1;
		boolean a = check(l, r, str);
		System.out.println(a);
	}
}
