package ErrorHandling;

public class ExceptionDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance=500;
		int withdrow_amount=2000;
		try{if(balance<withdrow_amount)
		{
			throw new ArithmeticException("insufficient balance");
		}
			balance=balance-withdrow_amount;
			System.out.print("Transaction successful");
		}
	catch (ArithmeticException e) {
		System.out.println("Exception :"+e.getMessage());
	}
	{
	System.out.println("Thanks ");
	}
}}

