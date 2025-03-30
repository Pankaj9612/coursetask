class Increment
{
	public static void main(String args[])
	{
		int a=12;
		System.out.println(a++);//12
		System.out.println(a);//13
		System.out.println(++a);//14
		System.out.println(a);//14
		System.out.println(a++ + ++a);//30
		System.out.println(a);16
		int b=5;
		System.out.println(b--);//5
		System.out.println(--b);//3
		System.out.println(b-- + --b);//4
	}
}