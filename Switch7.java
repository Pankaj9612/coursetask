import java.util.Scanner;
class Switch7
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Maharashtra");
		System.out.println("2.Goa");
		System.out.println("3.Kerala");
		System.out.println("4.Karnatak");
		System.out.println("5.Dubai");
		System.out.println("6.Singapore");
		System.out.println("7.Gujrat");
		System.out.println("Enter your choice: ");
		int str=sc.nextInt();

		switch(str)
		{
			case 1:
				{	
					System.out.println("----------WELCOME TO MAHARASHTRA------------");
					System.out.println("MAHARASHTRA");
					System.out.println("Amount: 55000");
					System.out.println("Places:\nv1\nv2\nv3\nv4");
					break;
				}
			case 2:
				{
					System.out.println("----------WELCOME TO GOA------------");
					System.out.println("Goa");
					System.out.println("Amount: 15000");
					System.out.println("Places:\nv1\nv2\nv3\nv4");
					break;
				}
			case 3:
				{
					System.out.println("----------WELCOME TO KERALA------------");
					System.out.println("Kerala");
					System.out.println("Amount: 35000");
					System.out.println("Places:\nv1\nv2\nv3\nv4");
					break;
				}
			case 4:
				{
					System.out.println("----------WELCOME TO KARNATAK------------");
					System.out.println("Karnatak");
					System.out.println("Amount: 35000");
					System.out.println("Places:\nv1\nv2\nv3\nv4");
					break;
				}
			case 5:
				{
					System.out.println("----------WELCOME TO DUBAI------------");
					System.out.println("Dubai");
					System.out.println("Amount: 25000");
					System.out.println("Places:\nv1\nv2\nv3\nv4");
					break;
				}
			case 6:
				{
					System.out.println("----------WELCOME TO SINGAPORE------------");
					System.out.println("Singapore");
					System.out.println("Amount: 15000");
					System.out.println("Places:\nv1\nv2\nv3\nv4");
					break;
				}
			case 7:
				{
					System.out.println("----------WELCOME TO GUJRAT------------");
					System.out.println("Gujrat");
					System.out.println("Amount: 15000");
					System.out.println("Places:\nv1\nv2\nv3\nv4");
					break;
				}
			default:{
				System.out.println("Invalid choice...");
			}
		}
	}
}