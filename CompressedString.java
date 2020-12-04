/*enter a string
//aabbaaa
string is:a2b2a3*/


import java.util.Scanner;

public class CompressedString {

	public static String compressBad(String str) {
		int count=0;
		String compressedString="";
		
		for(int i=0;i<str.length();i++) {
			count++;
			if(i+1>=str.length()||str.charAt(i)!=str.charAt(i+1)){
				compressedString +=""+str.charAt(i)+count;
				count=0;
			}
		}
		
		return compressedString.length()<str.length()?compressedString:str;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String string1=sc.nextLine();
		System.out.println("string is:"+compressBad(string1));

	}

}
