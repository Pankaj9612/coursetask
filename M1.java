class M1
{
	public static int add(int a,int b)
	{
		int c=a*b;
		return c;
	}

	public static void main(String args[])
	{
		//System.out.println(add(10,15));
		M1 obj= new M1();
		int d=obj.add(10,15);
		System.out.println(d);
	}
}
