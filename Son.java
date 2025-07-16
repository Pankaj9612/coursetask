package objectclass;

public class Son implements Father,Mother{
	public Son() {
		// TODO Auto-generated constructor stub
	}
	
	public void degree()
	{
		System.out.println("BA");
	}
	
	public static void main(String[] args) {
		
		Father f1=new Son();
		f1.degree();
		Father.msg1();
		Mother.msg();	
	}
}
