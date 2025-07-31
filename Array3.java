package array;

public class Array3 {

	public static void main(String[] args) {
		
		String [] fruits= {"Apple","Banana","Mango","Guava","Pine-Apple"};
		
		fruits[2]="balck-bery";
		System.out.println(fruits[2]);
		
		for(int i=0;i<fruits.length;i++)
		{
			System.out.println(fruits[i]);
		}
	}
}
