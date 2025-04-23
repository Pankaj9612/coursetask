import java.util.Scanner;
class For6
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your char: ");
		char n=sc.next().charAt(0);

		for (char i=n;i<='z' ;i++ ) {
			System.out.println(i);
		}
	}
}