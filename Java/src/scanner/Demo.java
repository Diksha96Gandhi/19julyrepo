package scanner;

import java.util.Scanner;

public class Demo {
	
	public int sum(int a, int b)
	{
		int c= a+b;
		return c;
	}
	public int sub(int a, int b)
	{
		int c= a-b;
		return c;
	}
	public int mul(int a, int b)
	{
		int c= a*b;
		return c;
	}
	public void div(int a, int b)
	{
		int c= a/b;
		System.out.println("Fynl result " +c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("enter value of x1");
        Scanner s = new Scanner(System.in);
         int x1 =s.nextInt();
         System.out.println("enter value of x2");
         int x2 = s.nextInt();
         System.out.println("enter value x3");
         int x3 = s.nextInt();
         System.out.println("enter value of x4");
         int x4 = s.nextInt();
         System.out.println("enter value x5");
         int x5 = s.nextInt();
         System.out.println("enter value of x6");
         int x6 = s.nextInt();
         
         
         Demo ob = new Demo();
        int sum=  ob.sum(x1, x2);
         int sub = ob.sub(sum, x3);
         int sum1 = ob.sum(sub, x4);
         int mul = ob.mul(sum1, x5);
         ob.div(mul, x6);
         
         
	}
	

}

