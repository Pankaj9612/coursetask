import java.util.Scanner;
class While7
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your char: ");
		char n=sc.next().charAt(0);

		while(n<='z')
		{
		
			System.out.println(n);
			n++;
		
		}		
	}	
}