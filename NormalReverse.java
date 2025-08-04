package array;

import java.util.Arrays;

public class NormalReverse {

	public static void main(String[] args) {
		
		int[] a= {12,23,57,35};
		int[] b= {3,4,5,6,7,8,9};
		
		int[] c= new int[a.length+b.length];
		
		int lengthb=b.length-1;
		for(int i=0;i<c.length;i++)
		{
			if(i<a.length)
			{
				c[i]=a[i];
			}
			else
			{
				c[i]=b[lengthb--];
			}
		}
		
		System.out.println(Arrays.toString(c));
	}
}
