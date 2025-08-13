package array;

public class LinearSearchAlgo {

	public static void main(String[] args) {
		
		int[] a= {1,2,6,3,4,9,7,5,8};
		int ele=5;
		
		System.out.println(Linearsearch(a, ele));
	}
	
	public static boolean Linearsearch(int[] a,int ele)
	{
		for(int i=0;i<a.length;i++)
		{
			if(ele==a[i])
			{
				return true;
			}
		}
		
		return false;
	}
}
