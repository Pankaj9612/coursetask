package array;

import java.util.Arrays;

public class SubArray {

	public static void main(String[] args) {
		
		int [] a= {10,20,1,2,3,30,40};
		int start=2;
		int end=5;
		int ans[]= new int[end-start];
		for(int i=start;i<end;i++)
		{
			ans[i-start]=a[i];
		}
		
		System.out.println(Arrays.toString(ans));
	}
}
