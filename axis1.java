class axis1
{
    public void add()
    {
        System.out.println("from non-static method..");
    }

    public static void main(String[] args) {
        System.out.println("from main method");
        axis1 a1=new axis1();
        a1.add();
    }
}