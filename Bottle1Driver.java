class Bottle1Driver
{
    public static void main(String args[])
    {
        Bottle1 b1= new Bottle1();
        System.out.println(b1);
        b1.displayBottle();
        Bottle1 b2= new Bottle1("cello","black",300.0,2);
        b2.displayBottle();
    }
}