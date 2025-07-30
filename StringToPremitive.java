package application;

public class StringToPremitive {

	public static void main(String[] args) {
		
		String s="2000";
		int ans=Integer.parseInt(s);
		System.out.println(ans);
		
		String s1="true";
		System.out.println(s1.toString());  // this is in the object format
		boolean ans1=Boolean.parseBoolean(s1);
//		System.out.println(ans1.toString());  	this is a primitive data type
		System.out.println(ans1);
		
		String s2="23456.46543";
		double ans2=Double.parseDouble(s2);
		System.out.println(ans2);
		
		String s3="123";
		short ans3=Short.parseShort(s3);
		System.out.println(s3);
		
		String s4="Pankaj";
		char ans4=s4.charAt(2);
		System.out.println(ans4);
	}
}
