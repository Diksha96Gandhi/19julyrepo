package programs;

public class Student {
	int age;
	int roll_no;
	public void display()
	{
		System.out.println("welcome to all");
	}
	public void display1()
	{
		System.out.println("Automation is very easy");
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ob = new Student();
		ob.age = 20;
		System.out.println("age is = "  + ob.age);
		ob.roll_no = 10;
		System.out.println("roll_no is = "  + ob.roll_no);
		ob.display();
		ob.display1();
		

	}

}
