package Inheritance;

public class Parent1 {
	public Parent1()
	{
		this(10,20,30,40);
		System.out.println("Parent Default Para");
	}
	public Parent1(int a)
	{
		this();
		System.out.println("1 parent Paramiterized constructor");
	}
	public Parent1(int a, int b)
	{
		this(10,20,30);
		System.out.println("2 parent Paramiterized constructor");
	}
	public Parent1(int a, int b, int c)
	{
		this(10);
		
		System.out.println("3 parent Paramiterized constructor");
	}
	public Parent1(int a, int b, int c, int d)
	{
		
		System.out.println("4 parent paramiterized constructor");
		
	}


	
}
