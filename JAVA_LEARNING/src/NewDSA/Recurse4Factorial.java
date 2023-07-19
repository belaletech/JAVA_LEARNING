package NewDSA;
import java.util.Scanner;

public class Recurse4Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number that you want to calculate factorial");
		int n=sc.nextInt();
		
		Recurse4Factorial obj=new Recurse4Factorial();
		var rec=obj.factorial(n);
		System.out.print(rec);
	}
	
	public int factorial(int n)
	{
		if(n<0)
		{
			return -1;
		}
		if(n==0 || n==1)
		{
			return 1;
		}
		return n*factorial(n-1);
	}

}
