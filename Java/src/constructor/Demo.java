package constructor;

public class Demo {
	public Demo()
	{
		this(10,20,30,40);
		System.out.println("default");
	}
	public Demo(int a)
	{
		this();
		System.out.println("one paramiterized");
	}
	public Demo(int a, int b)
	{
		this(10,20,30);
		System.out.println("two paramiterized");
		}
	
	public Demo(int a, int b, int c)
	{
		this(10);
		System.out.println("three paramiterized");
		}
	public Demo(int a, int b, int c, int d)
	{
		
		System.out.println("four paramiterized");
		
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Demo obj = new Demo(20,10);
     
	}

}
