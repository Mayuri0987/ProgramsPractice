import java.util.Scanner;

public class Sum {

	public static int FindSum(int n, int k) {

		int sumOfKthElements = 0;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % k == 0) {
				sumOfKthElements += i;
			}
		}
		System.out.println("Sum of kth elements:"+sumOfKthElements);
		sum = n * (n + 1) / 2;
		System.out.println("Sum of total 1 to n:"+sum);

		int result = sum - sumOfKthElements;
		System.out.println("Result is:"+result);

		return result;

	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range---");
		int n=sc.nextInt();
		System.out.println("Enter K");
		int k=sc.nextInt();
		FindSum(n, k);

	}

}
