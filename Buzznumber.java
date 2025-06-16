package application;
import java.util.Scanner;

public class Buzznumber {
	 public static void main(String[] args) {
		java.util.Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		String ans=(num%10==7 || num%7==0)?"It is buzz number":"It is not buzz number";
		System.out.println(ans);
	}
}

