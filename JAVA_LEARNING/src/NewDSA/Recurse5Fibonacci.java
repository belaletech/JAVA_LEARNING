package NewDSA;

import java.util.Scanner;
public class Recurse5Fibonacci {
	public int fibonacci(int n)
	{
		if(n<0)
		{
			return -1;
		}
		if(n==0 || n==1)
		{
			return n;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter to calcluate fibonacci number");
		int n=sc.nextInt();
		Recurse5Fibonacci fib=new Recurse5Fibonacci();
		var rec=fib.fibonacci(n);
		System.out.println(rec);
		
	}

}
