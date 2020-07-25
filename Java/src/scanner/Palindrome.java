package scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 252;
		int sum = 0;
		int old_num = number;
		
		
		{
		int r = number % 10;
		sum = sum*10+r;
		number = number/10;
	}
	if(old_num == sum)
	{
		System.out.println("palindrome number");
	}
	else
	{
		System.out.println("not palindrome");
	}
	}
}


