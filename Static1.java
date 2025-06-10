public class Static1 {
    static int i;
    static double d=1.1;
    public static void main(String[] args)
    {
        System.out.println(i);
        i=100;
        System.out.println(i);
        demo();
        System.err.println(i);
    }

    public static void demo()
    {
        System.err.println(i);
        i=-1;
        System.out.println(i);
    }

}
