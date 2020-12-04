
public class URLify {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Instantiate the string
        String str = "Mr John Smith   ";
        System.out.println(str);
         
        // Trim the given string
        str = str.trim();
        System.out.println(str);
         
        // Replace All space (unicode is \\s) to %20
        str = str.replaceAll("\\s", "%20");
         
        // Display the result
        System.out.println(str);
	}

}
