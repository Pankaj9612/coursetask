package array;

import java.util.Arrays;

public class ReverseTwoArrays {

	public static void main(String[] args) {
		
		int[] a = {10, 20, 30, 40, 50, 60};
        int[] b = {90, 80, 70, 60, 50};
        
        int[] c = new int[a.length + b.length];
        
        int l=a.length-1;
        int lb=b.length-1;
        for(int i=0;i<c.length;i++)
        {
        	if(i<a.length)
        	{
        		c[i]=a[l--];
        	}
        	else
        	{
        		c[i]=b[lb--];
        	}
        }
        
        System.out.println(Arrays.toString(c));
	}
}
