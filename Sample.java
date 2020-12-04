import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		a=sc.nextInt();
		
		System.out.println("eneter second number");
		b=sc.nextInt();
		
		int sum=a+b;
		System.out.println("sum is:"+sum);
		
		int substraction=a-b;
		System.out.println("substation is:"+substraction);
		
		int multilpication=a*b;
		System.out.println("multiplication is:"+multilpication);
		
		float division=a/b;
		System.out.println("division is:"+division);
		
	}

}
