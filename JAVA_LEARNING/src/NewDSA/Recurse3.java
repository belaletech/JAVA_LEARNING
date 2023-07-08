package NewDSA;
import java.util.Scanner;
public class Recurse3 {
	static int powerOfTwo(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			var power=2*powerOfTwo(n-1);
			return power;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		powerOfTwo(n);
	}

}
