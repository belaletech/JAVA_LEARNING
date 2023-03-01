package OOPS;

public class Construct_Rec {
	//h,w,perimeter all are Data memeber
	int h,w;
	float perimeter;

	//Constructor
	//Notice here there is no return type and name as class name
	Construct_Rec(){
		h=90;
		w=10;
		perimeter=0.5f*(h+w);
		System.out.println("Perimeter of Rectangle="+perimeter);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//notice here is no need to call a constructor
		Construct_Rec obj=new Construct_Rec();
		

	}

}
