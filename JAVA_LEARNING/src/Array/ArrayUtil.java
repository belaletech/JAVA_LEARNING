package Array;

public class ArrayUtil {
	public void printArray(int arr[] ) {
		int n=arr.length;
				for(int i=0;i<n;i++) {
					System.out.print(arr[i]+" ");
				}
	System.out.println();
	}
	public void arraydemo() {
		int[] myArray=new int[6];
		//printArray(myArray);
		myArray[0]=2;
		myArray[1]=8;
		myArray[2]=9;
		myArray[3]=10;
		myArray[4]=7;
		myArray[5]=6;
		//printArray(myArray);
		//myArray[6]=78;
		//printArray(myArray);
		System.out.println(myArray.length);
		System.out.println(myArray.length-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayUtil arrUtil=new ArrayUtil();
		arrUtil.arraydemo();

	}

}
