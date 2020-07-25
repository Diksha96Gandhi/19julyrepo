package Inheritance;

public class Child_M extends Parent_M {
	public void A()
	{
		
		System.out.println("Child default method");
		this.E(10, 20, 30, 40);
		
	}
	public void B(int a)
	{
		
		System.out.println(" Child one paramiterized method");
		this.A();
		
	}
	public void C(int a, int b)
	{
		
		System.out.println("Child two paramiterized method");
		
		}
	
	public void D(int a, int b, int c)
	{
		super.m5(10, 20, 30, 40);
		System.out.println("Child three paramiterized method");
		this.B(10);
		
		
		}
	public void E(int a, int b, int c, int d)
	
	{
	
		System.out.println("Child four paramiterized method");
		
		
		
		}

public static void main(String[] args) {
	Child_M obj = new Child_M();
	obj.D(10, 20, 30);

			
	

	}

}
