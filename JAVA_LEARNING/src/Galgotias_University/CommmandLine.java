package Galgotias_University;

public class CommmandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		for(int i=0;i<args.length;i++)
			a=a+Integer.parseInt(args[i]);
		System.out.print(a);

	}

}
