import java.util.Scanner; // neon no means square digit sum equals to number
class NeonNo
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a no: ");
		int no=sc.nextInt();
		int sqr=no*no;
		int sum=0;
		while(sqr>0)
		{
			int rem=sqr%10;
			sum=sum+rem;
			sqr/=10;
		}
		if(no==sum)
		{
			System.out.println("It is a Neon number");
		}
		else
		{
			System.out.println("It is not a neon number..");
		}
	}
}