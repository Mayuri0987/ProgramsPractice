import java.util.Scanner;

public class StringPalindrome {
	
	public static boolean ispalindrome(String str1,String str2) {
		if(str1.length()!=str2.length())
			return false;
    char[] ch1=str1.toCharArray();
    char[] ch2=str2.toCharArray();
		
		for(int i=0;i<ch1.length/2;i++) {
			char t=ch1[i];
			ch1[i]=ch1[ch1.length-1-i];
			ch1[ch1.length-1-i]=t;
			
		}
		System.out.println(ch1);
		
		
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]==ch2[i]) {
				return true;
			}
		}
		
		
		return false;
		
		
		
		
		
		
	}
	
	

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String string1=sc.nextLine();
	System.out.println("enter another string");
		String string2=sc.nextLine();
		
		
		if(ispalindrome(string1, string2)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not");
		}
	

	}

	}


