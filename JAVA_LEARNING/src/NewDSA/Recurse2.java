package NewDSA;
import java.util.*;

public class Recurse2 {
	static void recuMethod(int n) {
		if(n<1)
		{
			System.out.println("N is less than 1");
		}
		else
		{
			recuMethod(n-1);
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		recuMethod(n);
		
	}

}
