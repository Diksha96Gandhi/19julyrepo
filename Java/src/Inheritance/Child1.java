package Inheritance;

public class Child1 extends Parent1 {
	public Child1()
	{
		this(10);
		System.out.println("child Default Para");
	}
	public Child1(int a)
	{
		this(10,20,30);
		System.out.println("1 child Paramiterized constructor");
	}
	public Child1(int a, int b)
	{
		
		System.out.println("2 child Paramiterized constructor");
	}
	public Child1(int a, int b, int c)
	{
		
		super(10,20);
		System.out.println("3 child Paramiterized constructor");
	}
	public Child1(int a, int b, int c, int d)
	{
		
		this();
		System.out.println("4 child paramiterized constructor");
	}
	public static void main(String[] args) {
		Child1 obj = new Child1(10,20,30);
				
		
	}


}
