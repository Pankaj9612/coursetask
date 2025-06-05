class PenDriver
{
	public static void main(String[] args) 
	{
		Pen p1=new Pen();
		System.out.println(p1);

		p1.type="Ball-Pen";
		p1.color="Blue";
		p1.price=5;
		p1.width=1.2;
		p1.ink="black";

		p1.DisplayPen();
		System.out.println("<--------------------------------->");	
	}
}