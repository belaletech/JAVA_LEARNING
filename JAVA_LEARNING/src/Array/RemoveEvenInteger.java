package Array;
public class RemoveEvenInteger{

public static void printArray(int [] arr) {
	int n=arr.length;
	for(int i=0;i<n;i++)
	{
		System.out.println(arr[i]+" ");
	}
	System.out.println();
	}
public static int[] RemoveEven(int[] arr)
{
	int OddCount=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2!=0)
		{
			OddCount++;
		}
}
int[] result=new int[OddCount];
int idx=0;
for(int i=0;i<arr.length;i++)
{
	if(arr[i]%2!=0){
{
	result[idx]=arr[i];
	idx++;
	
}
}

}
return result;
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {3,2,4,7,10,6,5};
		System.out.println(arr);
		int[] result=RemoveEven(arr);
		System.out.println(result);

	}

}
