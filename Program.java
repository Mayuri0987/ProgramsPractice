import java.util.Scanner;

public class Program {
 
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String zoo=sc.nextLine();
		//System.out.println(word);

	    char ch[] = zoo.toCharArray();
	        int x=0;
	        int y=0;
	        int i=0;
	        int len = zoo.length();
	        while(i<len){
	            if(ch[i]=='z'){
	                x++;
	            }else if(ch[i] == 'o'){
	                y++;
	            }
	            i++;
	        }
	        if(2*x==y){
	            System.out.print("Yes");
	        }else{
	            System.out.print("No");
	        }
		
	}
}
