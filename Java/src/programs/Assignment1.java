package programs;

public class Assignment1 {
	
	public int sum(int a, int b)
	{
		int c;
		c= a+b;
		return c;
		
	}
	public int sub(int a, int b)
	{
		int x;
		x= a-b;
		return x;
	}
	public int mul(int a, int b)
	{
		int y;
		y= a*b;
		return y;
	}
	public void div(int a, int b)
	{
		int z;
		z= a/b;
		System.out.println("final result = " +z);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1 ob = new Assignment1();
		int sum = ob.sum(10, 2);
		int sub = ob.sub(sum, 2);
		int mul = ob.mul(sub, 2);
		int sum1 =ob.sum(mul, 2);
		ob.div(sum1, 2);
		
		

	}

}
