import java.util.Scanner;

class Static3
{
    static double pi=3.14;
    
    public static void main(String[] args)
    {
        System.err.println(pi);
        pi=10;
        System.out.println(Static3.pi);
        areaOfCircle(10);
        perimeterOfCircle(10);
    }

    public static void areaOfCircle(double rad)
    {
        double areaOfCircle=pi*(rad*rad);
        System.err.println(areaOfCircle);
    }

    public static void perimeterOfCircle(double rad)
    {
        double perimeterOfCircle=pi*2*rad;
        System.err.println(perimeterOfCircle);
    }
}
