import java.util.Scanner;
class For4
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your number: ");
		int n=sc.nextInt();
		for (int i=1;i<=10 ;i++ ) 
		{
			System.out.println(n+" * "+i+" = "+n*i);
		}		
	}	
}