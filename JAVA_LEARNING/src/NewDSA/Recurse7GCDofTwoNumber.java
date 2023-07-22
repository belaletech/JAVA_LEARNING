package NewDSA;
import java.util.*;

public class Recurse7GCDofTwoNumber {
	
	
	public int gcd(int a,int b)
	{
		if(a<0 || b<0)
		{
			return -1;
		}
		if(b==0)
		{
			return a;
		}
		return gcd(b,a%b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your first number");
		int a=sc.nextInt();
		System.out.println("Enter your second number");
		int b=sc.nextInt();
		
		
		Recurse7GCDofTwoNumber obj=new Recurse7GCDofTwoNumber();
		var c=obj.gcd(a, b);
		System.out.println("GCD of two number is "+c);
		
	}

}
