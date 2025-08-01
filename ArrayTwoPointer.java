package array;

public class ArrayTwoPointer {

	public static void main(String[] args) {
		
		int[] a= {1,2,1};
		int i=0,j=a.length-1;
		for(;i<j;i++,j--)
		{
			if(a[i]!=a[j])
			{
				break;
			}		
		}
		
		if(i<j)
		{
			System.out.println("It is not palindrome");
		}
		else
		{
			System.out.println("It is palindrome");
		}
	}
}
