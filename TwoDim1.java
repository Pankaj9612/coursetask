package application;
import java.util.Scanner;
public class TwoDim1 {

	public static void main(String[] args) {
		
		int[][] a=new int[2][2];
		System.out.println("Enter a values");
		Scanner sc=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
				sum+=a[i][j];
			}
		}
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+", ");
			}
			
			System.out.println();
		}
		
		System.out.println(sum);
 	}
}
