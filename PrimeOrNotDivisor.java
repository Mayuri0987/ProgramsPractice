import java.util.Collections;
import java.util.Vector;

public class PrimeOrNotDivisor {
	
	

	public static void main(String[] args) {
		
		 int num = 325;
	        boolean isComposite = false;
	        for(int i = 2; i <= num/2; i++)
	        {
	            // condition for non-prime number
	            if(num % i == 0)
	            {
	               isComposite = true;
	                break;
	            }
	        }

	        if (isComposite) {
	        	System.out.println(num + " is a composite number.");
	        	if(num%2==0) {
	        		
	        		System.out.println("smallest divisor is 2");
	        		
	        	}
	        	else {
	        		Vector<Integer> v= new Vector<Integer>();
	        		for(int i=1;i<=num;i++) {
	        			if(num % i==0) {
	        				v.add(i);
	        				
	        			}
	        		}
	        	 Collections.sort(v);
	        	 System.out.println(v);
	        	 System.out.println(v.get(1));
	        
	        	}
	        	
	        }
	            
	        else
	            System.out.println(num + " is a prime number.");
		
	}

}
