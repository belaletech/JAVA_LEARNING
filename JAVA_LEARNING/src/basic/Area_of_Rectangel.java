package basic;
import java.util.*;

public class Area_of_Rectangel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int l,b,area;
		System.out.print("Enter the value of Length\n");
		l=sc.nextInt();
		System.out.println("Enter the value of Breadth");
		b=sc.nextInt();
		area=l*b;
		System.out.print("Area of Rectangel is ="+area);
	}

}
