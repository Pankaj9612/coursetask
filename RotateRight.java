package array;

import java.util.Arrays;

public class RotateRight {

	public static void main(String[] args) {
		
		int[] a = {1,34,66,56,98,3};
		rotateNtimes(a,3);
		System.out.println(Arrays.toString(a));
	}
	
	public static void rotateNtimes(int []a,int n)
	{
		for(int i=0;i<n;i++)
		{
			rotateright(a);
		}
	}
	
	public static void rotateright(int[] a)
	{
		int temp=a[a.length-1];
		for(int i=a.length-1;i>0;i--)
		{
			a[i]=a[i-1];
		}
		
		a[0]=temp;
	}
}
