package array;

import java.util.Arrays;

public class RotateLeft {

	public static void main(String[] args) {
		
		int[] a = {1,34,66,56,98,3};
		rotateleft(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void rotateleft(int[] a)
	{
		int temp=a[0];
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		
		a[a.length-1]=temp;
	}
}
