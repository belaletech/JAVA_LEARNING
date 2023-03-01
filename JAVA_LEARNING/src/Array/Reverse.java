package Array;

public class Reverse {
	public static void Revserse(int[] numbers,int start,int end)
	{
		while(start>end)
		{
			int temp=numbers[start];
			numbers[start]=numbers[end];
			numbers[end]=temp;
			start++;
			end--;
		}
	}
	public static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {10,5,7,6,8};
		printArray(numbers);
		Revserse(numbers,0,numbers.length-1);
		printArray(numbers);
	}

}
