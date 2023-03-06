package Array;
import java.util.*;
import java.util.Arrays;

public class Insert_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int ar[]= {45,35,60,40,99,63};
		int newarr[]=new int[7];
		int index;
		int value;
		System.out.print("Enter index");
		index=in.nextInt();
		System.out.println("Enter values");
		value=in.nextInt();
		System.out.print("Before insertion"+Arrays.toString(ar));
		for(int i=0,j=0;i<newarr.length;i++)
		{
			if(index!=i)
			{
				//passing array value to new array
				newarr[i]=ar[j];
				j++;
			}
			else
				newarr[i]=value;
		}
		System.out.println("After insert :"+Arrays.toString(newarr));
		
		

	}

}
