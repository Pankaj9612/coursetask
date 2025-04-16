import java.util.Scanner;

class Scan9
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a your name: ");
		String s1=sc.nextLine();
		System.out.println("Enter a college name: ");
		String s5=sc.nextLine();
		System.out.println("class: ");
		String s2=sc.nextLine();
		System.out.println("Enter your CID: ");
		int s3=sc.nextInt();
		// System.out.println("Enter DOB: ");
		// LocalTime s4=LocalTime.now();
		System.out.println("Enter your address: ");
		String s6=sc.nextLine();
		System.out.println("Enter your phone number: ");
		long s7=sc.nextLong();
		System.out.println("Enter your Parent phone number: ");
		long s8=sc.nextLong();
		System.out.println(s1);
		System.out.println(s5);
		System.out.println(s2);
		System.out.println(s3);
		//System.out.println(s4);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);

	}
}