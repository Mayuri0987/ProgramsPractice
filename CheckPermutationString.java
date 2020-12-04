import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CheckPermutationString {

	public static boolean isPermutation(String str1,String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		char str1_array[]= str1.toCharArray();
		char str2_array[]=str2.toCharArray();
		
		Arrays.sort(str1_array);
		Arrays.sort(str2_array);
		
		for(int i=0;i<str1.length();i++)
		{
			if(str1_array[i]!=str2_array[i]) {
				return false;
				
			}
		}
		
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String string1=sc.nextLine();
		System.out.println("enter another string");
		String string2=sc.nextLine();
		
		if(isPermutation(string1, string2)) {
			System.out.println("Permutation");
		}
		else {
			System.out.println("not");
		}
	

	}

}
