package application;
import java.util.Scanner;
public class SumOfDiagonal {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a values");
		int[][] a = new int[4][4];
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i+j==a.length-1||i==j)
				{
					System.out.print(a[i][j]+" ");
					sum+=a[i][j];
				}
				
			}
			System.out.println();
		}
		
		System.out.println(sum);
	}
}
