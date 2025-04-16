import java.util.Scanner;

class Scan7
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first name: ");
		char a=sc.next().charAt(0);
		System.out.println("Enter a last name: ");
		char b=sc.next().charAt(0);

		String res=a+" "+b;
		System.out.println(res);	
	}
}