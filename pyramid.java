import java.util.Scanner;

public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows");
		int rowsnumber = sc.nextInt();
		int m = 1;

		// pyramid
		for (int i = 0; i < rowsnumber; i++) {
			for (int k = rowsnumber; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(m++ + " ");

			}
			System.out.println();
		}
		System.out.println();

		// reverse pyramid

		for (int i = 0; i < rowsnumber; i++) {
			for (int k = 0; k <= i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < rowsnumber - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// right angle
		for (int i = 0; i < rowsnumber; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// left side right angle
		for (int i = 0; i < rowsnumber; i++) {
			for (int k = 2 * (rowsnumber - i); k >= 0; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");

			}
			System.out.println();
		}
		System.out.println();

	}

}
