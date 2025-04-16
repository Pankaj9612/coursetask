import java.util.Scanner;

class Scan8
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first name: ");
		String a=sc.next();
		System.out.println("Enter a last name: ");
		String b=sc.next();

		String res=a+" "+b;
		System.out.println(res);	
	}
}