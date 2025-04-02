class Ladder
{
	public static void main(String args[])
	{	
		int marks=45;
		if(marks>0 && marks<35)
		{
			System.out.println("fail");
		}
		else if(marks>=35 && marks<=40)
		{
			System.out.println("pass");
		}
		else if(marks>40 && marks<=60)
		{
			System.out.println("First class");
		}
		else if(marks>60 && marks<=75)
		{
			System.out.println("Second class");
		}
		else if(marks>75 && marks<=100)
		{
			System.out.println("Destinction");
		}
		else{
			System.out.println("Wrong choice...");
		}
	}
}