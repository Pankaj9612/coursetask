import java.util.Scanner;
class DoWhile3
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int attempt=0;
		int storedpin=2234;
		do{
			System.out.println("Enter a pin: ");
				int pin=sc.nextInt();
				if(pin==storedpin)
				{
					System.out.println("login Successful");
				}
				else
				{
					System.out.println("Invalid Pin");
					attempt++;
				}
			}while(attempt<4);	
			if(attempt==4)
			{
				System.out.println("You reached max...");
			}	
	}	
}