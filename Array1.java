import java.util.Scanner;
class Array1
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a element in array: ");
		System.out.println("Size of Array: ");
		int size=sc.nextInt();

		int arr[]=new int[size];
		for (int i=0;i<arr.length;i++) 
		{
			arr[i]=sc.nextInt();		
		}	

		System.out.println("Elements in array: ");
		for (int i=0;i<arr.length ;i++ ) 
		{
			System.out.println(arr[i]);	
		}

		System.out.println("Enter a element to find:");
		int f=sc.nextInt();

		for (int i=0;i<arr.length ;i++ ) 
		{
			if(arr[i]==f)
			{
				System.out.println("Element is found at index: "+i);
			}	
		}
	}
}