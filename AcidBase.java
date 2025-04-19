import java.util.Scanner;
class AcidBase
{
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a PH-Level of your solution: ");
		int ph=sc.nextInt();

		if(ph>0 && ph<=6)
		{
			System.out.println("It represent acid property..");
		}
		else if(ph==7)
		{
			System.out.println("It represent neutral..");
		}
		else if(ph>7 && ph<=14)
		{
			System.out.println("It is represent basic property..");
		}
		else
		{
			System.out.println("You entered wrong PH-Level.");
		}
	}
}