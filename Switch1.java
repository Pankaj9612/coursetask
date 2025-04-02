class Switch1
{
	public static void main(String args[])
	{	
		char ch='p';
		switch(ch)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			{
				System.out.println("It is vowel");
			}
			default:
			{
				System.out.println("It is constant");
			}
		}
	}
}