package array;

public class Array6 {

	public static void main(String[] args) {
		
		int[] num= {1,2,3,4,5};
		
		System.out.println("Original Array: ");
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
		
		for(int i=0;i<num.length;i++)
		{
			num[i]=num[i]*2;
		}
		
		System.out.println("New Array: ");
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
	}
}
