class Swap2
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;

		System.out.println("Before swap value of a: "+a);
		System.out.println("Before swap value of b: "+b);

		a=b;
		b=a;
		a=b;

		System.out.println("After swap value of a: "+a);
		System.out.println("After swap value of b: "+b);	
	}
}