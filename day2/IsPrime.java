package week.day2;

public class IsPrime {
	public static void main(String[] args) {
		
		boolean p = false;
	    int n=3;
		
		for(int i=2;i<=n-1;++i) {
			 
		if(n%i==0)
		{
		 p = true;
		break;
		}
		 
		}
		if (!p)
			System.out.println(n+" Is a prime number");
			else {
				System.out.println(n+" Is not a prime number");
		}
	}
}
