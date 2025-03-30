class ternary4
{
	public static void main(String args[])
	{
		int a=20;
		int b=30;
		int c=35;

		int d=(a > b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println(d);//35
	}
}