import java.util.Scanner;
class Switch6
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
		System.out.println("Enter your day to see that day Workout: ");
		String str=sc.next();

		switch(str)
		{
			case "monday":
			case "MONDAY":
				{
					System.out.println("chest");
					break;
				}
			case "tuesday":
			case "TUESDAY":
				{
					System.out.println("Biceps");
					break;
				}
			case "wednesday":
			case "WEDNESDAY":
				{
					System.out.println("Triceps");
					break;
				}
			case "thursday":
			case "THURSDAY":
				{
					System.out.println("Leg");
					break;
				}
			case "friday":
			case "FRIDAY":
				{
					System.out.println("Back");
					break;
				}
			case "saturday":
			case "SATURDAY":
				{
					System.out.println("Sholder");
					break;
				}
			case "sunday":
			case "SUNDAY":
				{
					System.out.println("Rest");
					break;
				}
			default:{
				System.out.println("Invalid choice...");
			}
		}
	}
}