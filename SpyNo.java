import java.util.Scanner;
class SpyNo
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no: ");
		int no=sc.nextInt();
		int sum=0;
		int pro=1;
		while(no>0)
		{
			int rem=no%10;
			sum=sum+rem;
			pro=pro*rem;
			no/=10;
		}
		if(sum==pro)
		{
			System.out.println("It is spy number..");
		}
		else 
		{
			System.out.println("It is not spyno..");
		}
	}
}