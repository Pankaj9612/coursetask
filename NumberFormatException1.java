package application;

public class NumberFormatException1 {

	public static void main(String[] args) {
		String n="1234t";   //NFE
		int ans=Integer.parseInt(n);
		System.out.println(ans);
		
		String s1="12345.474734fbfbf"; //NFE
		double ans1=Double.parseDouble(s1);
		System.out.println(ans1);
		
		String s="12345.474734fbfbf";
		boolean b=Boolean.parseBoolean(s);
		System.out.println(b);
		
		
	}
}
