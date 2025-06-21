package application;
import java.util.Scanner;
public class Palindromenumber {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter a number: ");
			int num=sc.nextInt();
			int temp=num;
			int rev=0;
			palindrome(num,temp,rev);
		}
		
		public static void palindrome(int num,int temp,int rev)
		{
			while(num!=0)
			{
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
			}
			if(rev==temp)
			{
				System.out.println("The enter number is palindrome");
			}
			else
			{
				System.out.println("The enter number is not palindrome");
			}
		}
}
