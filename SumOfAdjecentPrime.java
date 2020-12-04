import java.util.Vector;

public class SumOfAdjecentPrime {
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
		for (int i = 1; i <= 100; i++) {

			if (isPrime(i)) {
				v.add(i);
			}
		}
		System.out.println(v);

		int n = v.size();
		int sum = 0;

		for (int i = 0; i + 1 < n; i++) {
			sum = v.get(i) + v.get(i + 1);
			System.out.println(v.get(i) + "+" + v.get(i + 1) + "=" + sum);
			i++;
		}
	}
}
