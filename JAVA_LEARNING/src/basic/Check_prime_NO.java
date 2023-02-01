package basic;
import java.util.*;

public class Check_prime_NO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int a,count=0;
		System.out.println("Enter your Number");
		a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
				count++;
		}
		if(count==2)
			System.out.println("Number is prime ");
		else
			System.out.println("Number is not prime ");

	}

}
