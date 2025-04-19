import java.util.Scanner;
class Tax
{
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Gross Salary: ");
		int gs=sc.nextInt();

		if(gs>0 && gs<=300000)
		{
			System.out.println("No tax");
		}
		else if(gs>300000 && gs<=600000)
		{
			System.out.println("You need to pay 5% tax");
		}
		else if(gs>600000 && gs<=900000)
		{
			System.out.println("You need to pay 10% tax");
		}
		else if(gs>900000 && gs<=1200000)
		{
			System.out.println("You need to pay 15% tax");
		}
		else if(gs>1200000 && gs<=1500000)
		{
			System.out.println("You need to pay 20% tax");
		}
		else if(gs>1500000 && gs<=gs)
		{
			System.out.println("You need to pay 30% tax");
		}
	}
}