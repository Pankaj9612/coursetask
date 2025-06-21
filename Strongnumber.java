package application;

public class Strongnumber {
	public static int fact(int rem)
	{
		int fact=1;
		while(rem!=0)
		{	
			fact=fact*rem;
			rem--;
		}
		
		return fact;
	}
	
	public static boolean digit(int num)
	{	
		int sum=0;
		int temp=num;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum + fact(rem);
			num/=10;
		}
		
		return sum==temp;
	}
	public static void main(String[] args) {
		System.out.println(digit(145));
	}
}
