package objectclass;

public  class ShapeImp implements Shapes{
	
	public void areaOfSquare(int side)
	{
		int area=side*side;
		System.out.println(area);
	}
	
	public void perimeterOfSquar(int side)
	{
		double peri=4*side;
		System.out.println(peri);
	}
	
	public void areaOfCircle(int radius)
	{
		double area= PI_VALUE *(radius*radius);
		System.out.println(area);
	}
	
	public void circumOfCircle(int rad)
	{
		double circum=2* PI_VALUE*rad;
		System.out.println(circum);
	}
	
	public static void msg()
	{
		System.out.println("This is dirty cal");
	}
}
