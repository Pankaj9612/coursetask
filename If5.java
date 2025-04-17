import java.util.Scanner;
class If5
{
	public static void main(String[] args) {
		Scanner d= new Scanner(System.in);
		System.out.println("You paid your fess?: ");
		boolean ip=d.nextBoolean();
		if(ip)
		{
			System.out.println("You paid a fees!");
		}
		System.out.println("Attend the class..");
	}
}