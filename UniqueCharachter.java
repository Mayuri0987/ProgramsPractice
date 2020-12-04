import java.util.Scanner;

public class UniqueCharachter {
	
	static boolean isUnique(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j))
					return false;
				
			}
		
		}
		return true;
		
		

		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String string=sc.nextLine();
		
		if(isUnique(string)) {
			System.out.println("it conatin unique characters");
		}
		else {
			System.out.println("not unique");
		}
	
		
		
	}

}
