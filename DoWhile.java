import java.util.Scanner;
class DoWhile
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int n=sc.nextInt();
		int i=1;
		do
		{
			System.out.println(n+" * "+i+" = "+n*i);
			i++;
		}while(i<=10);		
	}	
}