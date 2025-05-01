import java.util.Scanner;
class Power
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int no=sc.nextInt();
		System.out.println("Enter a power: ");
		int raise=sc.nextInt();
		int pro=1;
		for(int i=0;i<raise;i++)
		{
			pro=pro*no;
		}
		System.out.println(pro);
	}
}