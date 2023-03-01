package OOPS;
import java.util.*;
public class primeNumber {
	public static boolean checkPrime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		for(int i=2;i<Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number\n");
		int n=sc.nextInt();
		if(checkPrime(n))
		{
			System.out.println(n+ " is a prime number");
		}
		
		else
		{
			System.out.print(n+"is not a prime number\n");
		}

	}

}
