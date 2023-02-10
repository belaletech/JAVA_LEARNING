package Galgotias_University;
import java.util.*;
public class Sum_Of_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of odd natural number to add:");
	int n=sc.nextInt();
	int sum=0;
	for(int i=1;i<=n*2;i+=2)
	{
		sum +=i;
	}
System.out.println("The sum of first"+n+ "Odd natural numbers is:"+sum);
	}

}
