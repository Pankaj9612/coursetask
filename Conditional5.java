class Conditional5
{
	public static void main(String[] args) 
	{
		char ch='p';
		String ans=(ch>='a' && ch<='z')?(ch+" it is a LowerCase alphabet"):(ch+" it is a Not a LowerCase alphabet");
		System.out.println(ans);	
	}
}