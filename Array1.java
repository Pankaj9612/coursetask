package array;

public class Array1 {

	public static void main(String[] args) {
		
		int[] runs= new int[4];
		runs[0]=100;
		runs[1]=101;
		runs[2]=264;
		runs[3]=143;
		
		// Access one and one elements by hard code
		System.out.println(runs[0]=100);
		System.out.println(runs[1]=101);
		System.out.println(runs[2]=264);
		System.out.println(runs[3]=143);
		
		// Access every element by using loops
		for(int i=0;i<runs.length;i++)
		{
			System.out.println(runs[i]);
		}
		
		System.out.println("Length of  array: "+runs.length); // Used to check the length of the array
	}
}
