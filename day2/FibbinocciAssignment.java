package week.day2;

public class FibbinocciAssignment {
	public static void main(String[] args) {
		int num1=0, num2=1;
		int sum=0;
	
		for(int i=1;i<11;++i) {
			System.out.println(sum);
			sum = num1+num2;	
			num1=num2;
			num2=sum;
		}
		
		}
		
	}