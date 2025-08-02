package array;

import java.util.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		
		int [] a= {12,23,34,45,67,21,1};
		Linear1(a, 13);
		System.out.println(Arrays.toString(a));
	}
	
	public static void Linear1(int[]a,int ele)
	{
		int i=0;
		for(;i<a.length;i++)
		{
			if(a[i]==ele)
			{
				break;
			}
		}
		if(i==a.length)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element found");
		}
	}
}
