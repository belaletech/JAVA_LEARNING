package Galgotias_University;
 class Demo {
	String name;
	String city;
	int age;
	public void display(String name,String city)
	{
		this.name=name;this.city=city;
		System.out.println("Name and city of student:"+name+" and "+city);
	}
	
	public void display(String name,String city,int age)
	{
		this.name=name;
		this.city=city;
		this.age=age;
		System.out.println("Name,city and of student:"+name+","+city+" and "+age);
	}
}
	
	public class Methodoverload{
		public static void main(String[]args) {
			Demo obj=new Demo();
			obj.display("Belal", "siwan",22);
			obj.display("Sohel", "Ali");
		}
	}



