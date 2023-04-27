package OOPS;
import java.util.*;
class addition{
	void add(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your first number for addtion\n");
		int p=sc.nextInt();
		System.out.print("Enter your second number for addtion\n");
		int q=sc.nextInt();
		int r=p+q;
		System.out.println("Sum of two number is="+r);
	}
}
class subtraction extends addition{
	void sub() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your first number for subtraction\n");
		int a=sc.nextInt();
		System.out.print("Enter your second number for second\n");
		int b=sc.nextInt();
		int c=a-b;
		System.out.println("Difference of two number is="+c);
	}
}

 class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		subtraction obj=new subtraction();
		obj.add();
		obj.sub();

	}

}
