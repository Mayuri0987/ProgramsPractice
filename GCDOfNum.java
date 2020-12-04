import java.util.Scanner;
 class GCDOfNum {
	static int gcd(int m ,int n)
	{
	if(m<n)
	return gcd(n ,m);
	if(n==0)
	return m;
	return gcd(n, m%n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the two numbers");
		int p = sc.nextInt();
		int q = sc.nextInt();
		int a=gcd(p, q);
		System.out.println(a);

	}

}
