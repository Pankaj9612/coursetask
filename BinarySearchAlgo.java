package array;

public class BinarySearchAlgo {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7,8,9};
		int ele=6;
		BinarySearch(a, ele);		
	}
	
	public static void BinarySearch(int[] a,int ele)
	{
		int start=0, end=a.length-1;
		
		for(int i=0;i<a.length;i++)
		{
			int mid=(start+end)/2;
			if(a[mid]==ele)
			{
				System.out.println("Element found at  index"+mid);
				break;
			}
			else if(ele>a[mid])
			{
				start=mid+1;
			}
			else  if(ele<a[mid])
			{
				end=mid-1;
			}
			}
		}
	}

