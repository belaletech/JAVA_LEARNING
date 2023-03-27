package basic;
import java.util.*;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner primeNo=new Scanner(System.in);
		int no,count=0;
		System.out.println("Enter your first number");
		no=primeNo.nextInt();
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			count++;
		}
		if(count==2)
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");
	}

}
