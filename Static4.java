import java.util.Scanner;
class Static4
{   
    static {
        Scanner  sc = new Scanner(System.in);
        System.err.println("Enetr a number: ");
        int num=sc.nextInt();
        System.err.println(num);
    }
    

    public static void main(String args[])
    {
        System.err.println("hi ");
    }

     static 
    {
        int pi=10; 
        System.err.println(pi);
    }

    static 
    {
        System.err.println("hi i am here to write a code");
    }

   
}