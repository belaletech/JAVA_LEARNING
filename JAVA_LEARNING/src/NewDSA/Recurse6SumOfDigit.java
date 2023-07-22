package NewDSA;
import java.util.Scanner;

public class Recurse6SumOfDigit {
	public int sumOfDigit(int n)
	{
		if(n==0|| n<0)
		{
			return 0;
		}
		return n%10+sumOfDigit(n/10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number that you want of add of their digit");
		int n=sc.nextInt();
		Recurse6SumOfDigit obj=new Recurse6SumOfDigit();
		var c=obj.sumOfDigit(n);
		System.out.println(c);
	}

}
