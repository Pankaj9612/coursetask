import java.util.Scanner;

class grades
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your grades: ");
		int marks=sc.nextInt();

	if(marks>0 && marks<35)
	{
		System.out.println("You are fail: " +marks);
	}
	else if(marks>=35 && marks<60)
	{
		System.out.println("First class: " +marks);
	}
	else if(marks>=60 && marks<75)
	{
		System.out.println("Second class: " +marks);
	}
	else if(marks>=75 && marks<=100)
	{
		System.out.println("Distinction: " +marks);
	}
	else
	{
		System.out.println("You enterd wrong number..");
	}
	}
}