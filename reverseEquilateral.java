import java.util.Scanner;

public class reverseEquilateral {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("enter the number");
		int rows = sc.nextInt();
		
		for (int i= 0; i<= rows-1 ; i++)
	    {
	        for (int j=0; j<=i-1; j++)
	        {
	            System.out.print(" ");
	        }
	        for (int k=0; k<=rows-1-i; k++)
	        {
	            System.out.print("*" + " ");
	        }
	        System.out.println();
	    }
	}

}
