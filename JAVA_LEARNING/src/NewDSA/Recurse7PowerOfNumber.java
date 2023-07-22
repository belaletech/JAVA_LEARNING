package NewDSA;
import java.util.Scanner;
public class Recurse7PowerOfNumber {
	
	public int power(int base,int exp)
	{
		if(exp<0)
		{
			return -1;
		}
		if(exp==0 || exp==1)
		{
			return base;
		}
		return base*power(base,exp-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base");
		int base=sc.nextInt();
		System.out.println("Enter Exponent");
		int exp=sc.nextInt();
		
		
		Recurse7PowerOfNumber ob=new Recurse7PowerOfNumber();
		var result=ob.power(base, exp);
		System.out.println("Power of number =" +result);
	}

}
