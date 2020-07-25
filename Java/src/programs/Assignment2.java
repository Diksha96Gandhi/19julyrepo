package programs;

public class Assignment2 {
	public int sub(int a, int b)
	{
		int c;
		c= a-b;
		return c;
		
	}
	public int sum(int a, int b)
	{
		int x;
		x= a+b;
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
		System.out.println("final result " +z);
		
	}

	public static void main(String[] args) {
		Assignment2 obj = new Assignment2();
		int sub = obj.sub(10, 2);
		int sum = obj.sum(sub, 2);
		int sum1 =obj.sum(sum, 2);
		int mul = obj.mul(sum1, 2);
		obj.div(mul, 2);
		
		

	}


}
