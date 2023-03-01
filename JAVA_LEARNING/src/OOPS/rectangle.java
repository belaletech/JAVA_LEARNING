package OOPS;
import java.util.*;

public class rectangle {
	int h,w,area;
void getPara()
{
	h=10;
	w=5;
}
void findArea()
{
	area=h*w;
	System.out.println("Area of Rectangle="+area);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		rectangle belal=new rectangle();
		belal.getPara();
		belal.findArea();
		
	}

}
