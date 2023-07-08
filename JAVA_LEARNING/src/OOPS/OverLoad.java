package OOPS;

public class OverLoad {
	void ayan(int a)
	{
		System.out.println("ayan");
	}
	void ayan(String b)
	{
		System.out.print("Raza");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoad belal=new OverLoad();
		belal.ayan("nehal");
	}

}
