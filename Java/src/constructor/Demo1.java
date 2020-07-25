package constructor;

public class Demo1 {
	public void m1()
	{
		
		System.out.println("default method");
		this.m5(10, 20, 30, 40);
	}
	public void m2(int a)
	{
		
		System.out.println("one paramiterized method");
		
	}
	public void m3(int a, int b)
	{
		
		System.out.println("two paramiterized method");
		this.m2(10);
		}
	
	public void m4(int a, int b, int c)
	{
		
		System.out.println("three paramiterized method");
		this.m1();
		
		}
	public void m5(int a, int b, int c, int d)
	
	{
		
		System.out.println("four paramiterized method");
		this.m3(10, 20);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo1 ob = new Demo1();
ob.m4(10,20,30);
}

}
