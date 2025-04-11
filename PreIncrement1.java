class PreIncrement1
{
	public static void main(String[] args) 
	{
		int a=3;
		System.out.println(a++ + a++ + a + a++);

		int a1=2;
		int b=3;
		System.out.println(a1++ + b++ + a1+ b+ b++ +a1);

		int a2=3;
		int b1=a2++;
		System.out.println(a2++ + b1++ + b1 + a2);	

		int a3=2;
		int b2=3;
		System.out.println(++a + ++b);
	}
}