import java.util.Scanner;

public class Fibonancii {
	
//	public static int fib(int n) {
//		if(n==0)
//			return 0;
//		if(n==1)
//			return 1;
//		return fib(n-1)+fib(n-2);
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc= new Scanner(System.in);
//		int num=sc.nextInt();
//		int f=fib(num);
//		System.out.println(f);
//
//	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int range=sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		System.out.print(a);
		System.out.print(b);
		for(int i=2;i<=range;i++) {
			
			if(c<=range)
			{
				c=a+b;
				System.out.print(c);
				a=b;
				b=c;
			}
		}
		
	}

}
