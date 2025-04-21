import java.util.Scanner;
class Switch8
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Monday");
		System.out.println("2.Tuesday");
		System.out.println("3.wednesday");
		System.out.println("4.Thursday");
		System.out.println("5.Friday");
		System.out.println("6.Saturday");
		System.out.println("7.Sunday");
		System.out.println("Enter your choice: ");
		int str=sc.nextInt();

		switch(str)
		{
			case 1:
				{
					System.out.println("Monday");
					break;
				}
			case 2:

				{
					System.out.println("Tuesday");
					break;
				}
			case 3:
		
				{
					System.out.println("wednesday");
					break;
				}
			case  4:
	
				{
					System.out.println("Thursday");
					break;
				}
			case 5:
				{
					System.out.println("Friday");
					break;
				}
			case 6:
	
				{
					System.out.println("Saturday");
					break;
				}
			case 7:
				{
					System.out.println("Sunday");
					break;
				}
			default:{
				System.out.println("Invalid choice...");
			}
		}
	}
}