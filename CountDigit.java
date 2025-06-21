package application;
import java.util.Scanner;
public class CountDigit {
	public static int count(int num)
	{
		int count=0;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(count(12343));
		
	}
}
