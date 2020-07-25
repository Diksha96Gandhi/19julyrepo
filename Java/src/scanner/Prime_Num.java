package scanner;

public class Prime_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0;
		int n=66;
		int half=n/2;
		for(int i=2;i<=half;i++)
		{
			if(n%i==0)
				System.out.println("prime number " +n);
		a=1;
		break;
		}
		if(a==0)
			System.out.println("not a prime number " +n);
			
		}

	}


