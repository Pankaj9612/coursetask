package application;

public class Armstrongnum {
	public static int power(int base,int raise)
	{
		int pow=1;
		for(int i=0;i<raise;i++)
		{
			pow=pow*base;
		}
		return pow;
	}
	
	public static int count(int num)
	{
		int count=0;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		
		return count;
	}
	
	public static boolean armstrong(int num)
	{
		int ct=count(num);
		int temp=num;
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum+power(rem,ct);
			num/=10;
		}
		return sum==temp;
	}
	
	public static void main(String[] args) {
		System.out.println(power(2,3));
		System.out.println(count(123));
		System.out.println(armstrong(153));
	}
}
