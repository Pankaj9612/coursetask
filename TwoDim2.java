package application;
import java.util.Scanner;
public class TwoDim2 {

	public static void main(String[] args) {
		
		int[][] a=new int[2][2];
		System.out.println("Enter a values");
		Scanner sc=new Scanner(System.in);
		int sum,total=0;
		for(int i=0;i<a.length;i++)
		{	
			sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
				sum+=a[i][j];
				
			}
			total+=sum;
			System.out.println("Sum of "+i+" Position subarray: "+ sum);
		}
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+", ");
			}
			
			System.out.println();
		}
		System.out.println("Sum of all elements in to the dimenstional array: "+total);
 	}
}
