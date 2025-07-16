package objectclass;

import java.awt.Shape;

public class ShapeDriver {

	public static void main(String[] args) {
		
		Shapes s1=new ShapeImp();
		
		s1.areaOfCircle(12);
		s1.areaOfSquare(4);
		s1.circumOfCircle(4);
		//s1.perimeterOfSquare(4);
		
	//	s1.msg();  // we can access only a static method using class name as reference name
		Shapes.msg();
		ShapeImp.msg();
		
		
		ShapeImp s2=new ShapeImp();
		
		s2.areaOfCircle(34);
		s2.areaOfSquare(45);
		s2.circumOfCircle(4);
		
		// s2.msg();
		ShapeImp.msg();
	}
}
