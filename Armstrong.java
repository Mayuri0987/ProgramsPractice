import java.util.Scanner;

public class Armstrong {
	static int countDigits(int num) {
		int count = 0;
		while (num > 0) {

			count++;
			num = num / 10;

		}
		return count;

	}

	static int power(int n, int p) {
		int pow = 1;
		while (p > 0) {
			pow = pow * n;
			p--;
		}
		return pow;
	}

	static boolean isAmstrong(int x) {
		int nd = countDigits(x);
		int t = x;
		int sum = 0;
		while (t > 0) {
			int r = t % 10;
			sum = sum + power(r, nd);
			t = t / 10;
		}
		if (sum == x)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		boolean r = isAmstrong(n);
		if (r)
			System.out.println("Given num is Armstrong");
		else
			System.out.println("Given num is not Armstrong");
	}

}
