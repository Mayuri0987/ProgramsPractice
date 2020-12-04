import java.util.Vector;

public class Prime {

	public static boolean isPrime(int num) {
		if (num == 1)
			return false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		for (int i = 1000; i <= 9999; i++) {

			if (isPrime(i)) {
				v.add(i);
			}

		}
		int n = v.size();

		int num = 0, a = 0, b = 0;

		for (int i = 0; i < n; i++) {
			num = v.get(i);
			int temp = num;
			int r, sum = 0;
			while (num > 0) {
				r = num % 10;
				sum = sum + r;
				num = num / 10;
			}
			if (isPrime(sum)) {
				a = 0;
				b = temp;
				if (a < b) {

					a = b;
				}

			}
		}
		System.out.println("Highest 4 digit number whos sum is also prime number is " + a);

	}
}
