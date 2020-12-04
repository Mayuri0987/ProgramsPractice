import java.util.Scanner;

public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter 2 d arry size::");
//		int rows=sc.nextInt();
//		int coloumns=sc.nextInt();
//		
//		System.out.println("enter array elements---");
//		
//		int twoD[][]=new int[rows][coloumns];
//		
//		 for(int i=0; i<rows;i++)
//         {            
//            for(int j=0; j<coloumns;j++)
//            {
//                twoD[i][j]=sc.nextInt();
//            }
//         }
//		 System.out.print("\nData you entered : \n");
//		 for(int []x:twoD){
//	            for(int y:x){
//	            System.out.print(y+"        ");
//	            }
//	            System.out.println();
//	        }
//		 
		 System.out.println("enter the size of array");
		 int size=sc.nextInt();
		 
		 int polyArray []= new int[size];
		 
		 System.out.println("enter the arry elements");
		 
		 int coordinates[]=new int[2];
		 
		 for(int i=0;i<size;i++) {
			 polyArray[i]=sc.nextInt();
		 }
		 
		 System.out.println("Your array is:::");
		 
		 
		 for(int i=0;i<size;i++) {
			 
			 System.out.print(" "+polyArray[i]);
		 }
	}

}
