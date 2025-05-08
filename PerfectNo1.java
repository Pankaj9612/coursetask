import java.util.Scanner;
class PerfectNo1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int no=sc.nextInt();
		int sum=0;
		int dup=no;
		int den=1;
		while(den<no)
		{
			if(no%den==0)
			{	
				sum=sum+den;
			}
			den++;
		}
		if(sum==dup)
		{
			System.out.println("It is perfect number..");
		}
		else
		{
			System.out.println("It is not perfect number..");
		}
	}
}