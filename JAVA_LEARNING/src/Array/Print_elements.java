package Array;

public class Print_elements {
	public void printArray(int []arr)
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
	}
	System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print_elements Print_elements =new Print_elements();
		Print_elements.printArray(new int[] {2,10,5,20,5});

	}

}
