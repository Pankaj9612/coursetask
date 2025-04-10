class Circle
{
	public static void main(String[] args) 
	{
		float radius=5.5f;
		final float PI = 3.14f;
		float area=PI*radius*radius;
		System.out.println("Area of circle is: "+area);
		float perimeter=2*PI*radius;
		System.out.println("Perimeter of Circle is: "+perimeter);	
	}
}