package Galgotias_University;

 class Vehicles{
	public void run()
	{
		System.out.print("vehicles class run");
	}

}
class Car extends Vehicles{
	public void run()
	{
		System.out.println("car class run");
	}
}
public class OverrideDemo{
	public static void main(String[] args)
	{
		Car obj=new Car();
		obj.run();
	}
}
