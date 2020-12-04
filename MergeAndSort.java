
public class MergeAndSort {
	
	//Function to merge Arrays
	public static int[] mergeArray(int arr1[],int arr2[],int result[],int n,int m) {
		int j=0;
		for(int i=0;i<arr1.length;i++,j++) {
			result[j]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++,j++) {
			result[j]=arr2[i];
		}
		return result;
		
	}
	//Function to sort Array
	public static int[] sortArray(int result[]) {
		
		for(int i=0;i<result.length-1;i++) {
			
			//checking the condition for two 
			//consecutive elements of array
			if(result[i]>result[i+1]) {
				//Swapping using temporary variable
				int temp=result[i];
				result[i]=result[i+1];
				result[i+1]=temp;

                
                // so that -1 becomes 0 (incremented by 1)
                // and the loop begins from the start. 
				i=-1;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int arr1[]= {-1, 2, 8,9,100};
		int arr2[]= {-2, 5, 6,2,36};
		int n= arr1.length;
		int m= arr2.length;
		int result[]=new int[m+n];
		
		//calling function mergeArray
		mergeArray(arr1, arr2, result,n,m);
		System.out.println("Merge list");
		
		for(int i=0;i<n+m;i++) {
			System.out.println(result[i]);
		}
		
		//calling function sortArray
		sortArray(result);
		System.out.println("sorted array is");
	
	    for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}

	}

}
