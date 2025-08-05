package array;

import java.util.Arrays;

public class RemoveRangeElement {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7,8};
		int start=2;
		int end=5;
		
		if(start<end && start>=0 && end<a.length)
		{
			int[] ans=new int[a.length-(end-start)];
			for(int i=0;i<ans.length;i++)
			{
				if(i<start)
				{
					ans[i]=a[i];
				}
				else
				{
					ans[i]=a[i+(end-start)];
				}
			}	
			System.out.println(Arrays.toString(ans));
		}
		else
		{
			System.out.println("You entered wrong choice");
		}
	}
}
