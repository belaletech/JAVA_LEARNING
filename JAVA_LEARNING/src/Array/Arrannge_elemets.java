package Array;
import java.util.*;
import java.util.Arrays;

public class Arrannge_elemets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int no,temp;
		System.out.print("Enter no of elements you want in array");
		no=sc.nextInt();
		//Array declaration
		int ar[]=new int[no];
		//taking user input
		System.out.println("Enter "+no+" elemets");
		for(int i=0;i<no;i++)
			ar[i]=sc.nextInt();
		//printing array elements
		System.out.println("Before sorting:");
		System.out.println(Arrays.toString(ar));
		//Arranging elements in ascending order
		for(int i=0;i<no;i++)
		{
			for(int j=i+1;i<no;j++)
			{
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		//Printing array elements
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(ar));
		
	}

}
