package mainMethod;

public class TrailError {
	
	int a;int b;

public TrailError(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("Hello world");
//
//	}
//	private static void main(String[] args) {
//		System.out.println("private main method");
//	}

//	Error: Main method not found in class mainMethod.TrailError, please define the main method as:
//		   public static void main(String[] args)
//		or a JavaFX application class must extend javafx.application.Application
//	
//	public  void main(String[] args) {
//		System.out.println("without static");
//	}
//	
	
	final static   void main(String[] args) {
		System.out.println("hello");
	}

}
