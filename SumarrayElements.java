package array;

public class SumarrayElements {

	public static void main(String[] args) {
		
		int [] num= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
			sum= sum+num[i];
		}
		
		System.out.println("Sum of the number is: "+sum);
	}
}
