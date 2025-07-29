package application;
// Wrapper Class
public class Wrap {

	public static void main(String[] args) {
		int i=100;
		Integer i1=new Integer(i);
		System.out.println(i1);
		System.out.println(i1.toString());
		
		byte a=126;
		Byte b1=new Byte(a);
		System.out.println(b1);
		System.out.println(b1.toString());
		
		Character ch=new Character('a');
		System.out.println(ch);
		System.out.println(ch.toString());
		
		Short s= new Short(a);
		System.out.println(s);
		
		long d=34994559;
		Long l=new Long(d);
		System.out.println(l);
		
		float k=244.565f;
		Float f=new Float(k);
		System.out.println(f);
		
		double z=49494.578484;
		Double d1=new Double(z);
		System.out.println(d1);
	}
}
