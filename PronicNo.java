import java.util.Scanner;//two consecative no multiplication is the given no..
class PronicNo
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no: ");
		int no=sc.nextInt();
		int no1=0;
		for (int k=0;k<=no ;k++) {
			no1=k*(k+1);
			if(no1==no)
			{
				System.out.println("it is pronic number..");
				break;
			}
		}
		if(no1!=no)
		{
			System.out.println("it is not pronic number..");
		}
	}
}