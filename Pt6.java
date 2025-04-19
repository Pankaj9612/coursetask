import java.util.Scanner;
class Pt6
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a row number :");
		int n= sc.nextInt();
		System.out.println("Enter  a column number: ");
		int m=sc.nextInt();

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(j==1 || i==1 || j==m || i==n )
				{
				System.out.print("*");
				}
			else {
				System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
}