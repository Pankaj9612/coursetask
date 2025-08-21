package application;
import java.util.Arrays;
import java.util.Scanner;
public class Borderelementsum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int[][] a=new int[3][3];
		System.out.println("enter a values: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
//		System.out.println(Arrays.toString(a));  print the address of the subarray
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i==0||j==0||i==a.length-1||j==a[i].length-1)
				{
					System.out.print(a[i][j]+", ");
					sum+=a[i][j];
				}
				System.out.print("  "+" ");
			}
			
			System.out.println();
		}
		System.out.println("Sum of the  border element is : "+sum);
	}
}
