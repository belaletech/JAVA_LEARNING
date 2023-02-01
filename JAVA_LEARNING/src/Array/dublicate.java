package Array;

public class dublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar= {20,30,50,60,80,30,20};
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if((ar[i]==ar[j])&&(i!=j))
						{
					System.out.println("Duplicate Element is "+ar[j]);
						}
			}
		}

	}

}
