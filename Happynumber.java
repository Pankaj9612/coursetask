package application;

public class Happynumber {
	
	public static int sumofSqdigit(int num)
	{
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum+(rem*rem);
			num/=10;
		}
		return sum;
	}
	
	public static boolean ishappy(int num)
	{
		while(num!=1 && num!=4)
		{
			num=sumofSqdigit(num);
		}
		
		return num==1;
	}
	
	public static void main(String[] args) {
		System.out.println(ishappy(90));
	}
}
