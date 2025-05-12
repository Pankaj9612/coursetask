import java.util.Scanner;
class UglyNo
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int no=sc.nextInt();
		while(no>1)
		{
			if(no%2==0)
			{
				no/=2;
			}
			else if(no%3==0)
			{
				no/=3;
			}
			else if(no%5==0)
			{
				no/=5;
			}
			else 
			{
				break;
			}

		}
		if(no==1)
		{
			System.out.println("it is ugly no");
		}
		else
		{
			System.out.println("Its not a ugly no");
		}
	}
}