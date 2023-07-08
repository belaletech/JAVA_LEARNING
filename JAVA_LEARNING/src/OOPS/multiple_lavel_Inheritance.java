package OOPS;
import java.util.*;
class vehicle{
	Scanner read=new Scanner(System.in);
	void Cars()
	{
		//Scanner read=new Scanner(System.in);
		String arr[]= {"1.Xuv500","Mercetagebenge","Vitara breza","Scorpio","Duster"};
		System.out.print("List of car\n");
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.print("Select your car\n");
		int a=read.nextInt();
		switch(a) {
		case 1:
			System.out.println(" Xuv500");
			break;
		case 2:
			System.out.println("Mercetagebenge");
			break;
		case 3:
			System.out.println("Vitara breza");
			break;
		case 4:
			System.out.println("Scorpio");
			break;
		case 5:
			System.out.print("Duster");
			break;
			default:
				System.out.print("Invalid choice");
		}
	}
}
class Vehicle01 extends vehicle{
	void bike() {
		//Scanner sc=new Scanner(System.in);
		String arr1[]= {"pulsor","ktm","shin","splendor","Ducati","Activa"}; 
		int j=0;
		for( j=0;j<arr1.length-1;j++);
		System.out.println("List of bike is :" +arr1[j]);
		
	}
}

class Vehicles02 extends Vehicle01{
	void bus() {
		//Scanner sc=new Scanner(System.in);
		String arr2[]= {"Single-decker","Double-decker","Coach","School bus","Minibus"};
		for(int k=0;k<arr2.length-1;k++)
			System.out.println("list of buses are :"+arr2[k]);
	}
}

public class multiple_lavel_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicles02 obj=new Vehicles02();
		obj.Cars();
		obj.bike();
		obj.bus();

	}

}
