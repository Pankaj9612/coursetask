import java.util.Scanner; // divisible by 7 or 7 present at last place in number
class BuzzNo
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a no: ");
		int no=sc.nextInt();
		if((no%10==7 || no%7==0))
		{
			System.out.println("It is a Buzz number");
		}
		else
		{
			System.out.println("It is not a Buzz number..");
		}
	}
}