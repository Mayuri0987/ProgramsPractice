
public class DisplayPrime {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//1 to 10 prime numbers
		for(int i=1;i<=10;i++) {
			boolean isPrime=true;
			
			
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}		
			}
			if(isPrime) {
				System.out.print(i+" ");
			}
		}
		
		//check number is prime or not
		
	
		
		
		
			
		

	}

}
