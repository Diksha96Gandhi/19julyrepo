package scanner;

import java.util.Scanner;

public class Swap_using_var {
	public void swap(int a, int b)
	{
		  int temp;
          temp=a;
          a=b;
          b=temp;
          
          System.out.println("value of a " +a);
          System.out.println("value of b " +b);
          
          
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swap_using_var ob = new Swap_using_var();
		
		  System.out.println("please enter values"); Scanner sc = new
		  Scanner(System.in); int a = sc.nextInt(); int b = sc.nextInt();
		  
		  System.out.println("after swapping the value is");
           
           ob.swap(10, 20);
           
           
           
           
           
	}

}
