class axis
{   static int a=1;
    public static void add(int num)
    {
        System.out.println("from static method..");
        System.out.println(num);
    }

    public static void main(String[] args) {
        System.out.println("from main method");
        axis a1=new axis();
        a1.add(a++);
        axis a2=new axis();
        a2.add(a++);
    }
}