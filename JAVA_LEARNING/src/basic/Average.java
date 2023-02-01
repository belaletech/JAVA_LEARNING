package basic;
import java.util.*;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int hindi,eng,math,sci,sst,IT;
		float avg;
		System.out.println("Enter the value of hindi");
		hindi=sc.nextInt();
		System.out.println("Enter the value of english");
		eng=sc.nextInt();
		System.out.println("Enter the value of math");
		math=sc.nextInt();
		System.out.println("Enter the value of Science");
		sci=sc.nextInt();
		System.out.println("Enter the value of Social Science");
		sst=sc.nextInt();
		System.out.println("Enter the value of IT");
		IT=sc.nextInt();
		avg=(hindi+eng+math+sci+sst+IT)/6;
		System.out.println("Averge of Entire course is "+avg);
		

	}

}
