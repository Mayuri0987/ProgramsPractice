
import java.util.Scanner;

public class CompositePattern {

	public static boolean isComposite(int num) {
		if (num == 1)
			return true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows");
		int rowsnumber = sc.nextInt();
		int k = 1;
		for (int row = 0; row < rowsnumber ; row++) {
			for (int coloumn = 0; coloumn <= row; coloumn++) {

				while (!isComposite(k)) {
					k++;
				}
				System.out.format("%5d", k);
				++k;
			}
			System.out.println();
		}
		for (int row = rowsnumber - 1; row >= 0; row--) {
			for (int cloumn = 0; cloumn <= row - 1; cloumn++) {
				while (!isComposite(k)) {
					k++;
				}
				System.out.format("%5d",k);
				++k;
			}
			System.out.println();
		}

	}
};
