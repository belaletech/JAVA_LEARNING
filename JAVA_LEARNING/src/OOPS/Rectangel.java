package OOPS;
import java.util.*;

public class Rectangel {
	int h,w,area;
	void findArea()
	{
		area=h*w;
		System.out.print("Area of Rectangle=" + area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangel belal=new Rectangel();
		belal.h=10;
		belal.w=25;
		belal.findArea();

	}

}
