import java.util.Iterator;
import java.util.Scanner;

public class HollowBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		for (int i=1;i<=n ;i++ )
		{
		for (int j=1;j<=n ;j++ )
		{
		if (i==1||j==1||i==n||j==n)
		{
		System.out.print("*");
		}
		else
		{
		System.out.print(" ");
		}
		}
		System.out.println();
		}
	}

}
