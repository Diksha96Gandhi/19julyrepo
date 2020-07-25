package Inheritance;

public class Parent_M {
	public void m1()
	{
		
		System.out.println("Prent default method");
		this.m2(10);
		
		
	}
	public void m2(int a)
	{
		
		System.out.println("Parent one paramiterized method");
		this.m4(10, 20, 30);
		
	}
	public void m3(int a, int b)
	{
		
		System.out.println("Parent two paramiterized method");
		
		}
	
	public void m4(int a, int b, int c)
	{
		
		System.out.println("Parent three paramiterized method");
		this.m3(10, 20);
		
		
		}
	public void m5(int a, int b, int c, int d)
	
	{
		
		System.out.println("Parent four paramiterized method");
		this.m1();
		
		}
}
