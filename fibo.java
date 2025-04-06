import java.util.Scanner;
class fibo{
public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter a number: ");
	int n=sc.nextInt();
	int no1=0;
	int no2=1;
	System.out.print(no1);
	System.out.print(no2);
	for(int i=1;i<=n;i++)
	{
		int temp=no1;
		no1=no2;
		no2=temp+no1;
		System.out.print(no2);
		
	}
}
}