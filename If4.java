import java.util.Scanner;
class If4
{
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter your bill amount: ");
		int amt=a.nextInt();
		if(amt>500)
		{
			amt=amt-(amt*10/100);
			System.out.println("Discount Applied!");
		}
		System.out.println("Your Grand Total: "+amt);
	}
}