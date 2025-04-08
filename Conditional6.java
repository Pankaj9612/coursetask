class Conditional6
{
	public static void main(String[] args) 
	{
		char ch='R';
		String ans=(ch>='A' && ch<='Z')?(ch+" it is a UpperCase alphabet"):(ch+" it is a Not a UpperCase alphabet");
		System.out.println(ans);	
	}
}