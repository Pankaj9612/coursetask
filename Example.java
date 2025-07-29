package application;

public class Example {

	public static void main(String[] args) {
		
		System.out.println("From main Method");
	}
	
	public class A{
		static
		{
			System.out.println("From class A");
		}
	}
	
	public class B{
		static 
		{
			System.out.println("From class B");
		}
	}
}

class D{
	static 
	{
		System.out.print("Hi");
	}
}
