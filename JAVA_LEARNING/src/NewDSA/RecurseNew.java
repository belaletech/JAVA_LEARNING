package NewDSA;

public class RecurseNew {
	static void firstMethod()
	{
		secondMethod();
		System.out.println("I am the first method");
	}
	static void secondMethod()
	{
		thirdMethod();
		System.out.println("I am the second method");
	}
	static void thirdMethod()
	{
		fourthMethod();
		System.out.println("I am the third method");
	}
	static void fourthMethod()
	{
		System.out.println("I am fourth method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstMethod();
	}

}
