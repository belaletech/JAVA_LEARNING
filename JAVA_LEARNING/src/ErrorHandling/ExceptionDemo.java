package ErrorHandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.print(10/0);
			
				System.out.print("inside try block");
			
		}
		catch(Exception e) {
			System.out.println("Exception is :"+e.getMessage());
		}
		System.out.print("After Exception");
	}
	}


