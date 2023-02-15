//WAP TO take tow numbers from user and add them

package OOPS;
import java.util.*;

public class DAY1 {
	public void Add()
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your first number=");
		a=sc.nextInt();
		System.out.print("Enter your second number=");
		b=sc.nextInt();
		int c=a+b;
		System.out.print("Sum of Two Number is="+c);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DAY1 belal=new DAY1();
		belal.Add();

	}

}
