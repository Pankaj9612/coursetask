import java.util.Scanner;
class DoWhile2
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your char: ");
		char n=sc.next().charAt(0);

		do{
			System.out.println(n);
			n++;
		}while(n<='z');		
	}	
}