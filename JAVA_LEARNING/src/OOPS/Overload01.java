package OOPS;

public class Overload01 {
	void show(int ... a)
	{
		System.out.print("Galgotias");
	}
	void show(int a)
	{
		System.out.print("University");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overload01 belal=new Overload01();
		belal.show(10,10,10);
	}

}
