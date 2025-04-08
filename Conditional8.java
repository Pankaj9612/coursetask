class Conditional8
{
	public static void main(String[] args) 
	{
		char ch='a';
		String ans=((ch>=65 && ch<=90) || (ch>=97 && ch<=122))?
		((ch>=65 && ch<=90)?
		(ch+" it is a UpperCase alphabet.."):
		(ch+" it is a LowerCase alphabet")):
		((ch>=48 && ch<=57)?
		(ch+" it is digit"):
		(ch+" it is a special Character"));
		System.out.println(ans);	
	}
}