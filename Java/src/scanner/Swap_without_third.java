package scanner;

import java.util.Scanner;

public class Swap_without_third {
    
   
	public static void main(String[] args) {
		

		System.out.println("enter the value");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("before swaping numbers" +a +" " +b);
		

 a= a+b;
 b=a-b;
 a=b-a;
 
 System.out.println("after swapping the values" +a +" " +b);

	}
	}


