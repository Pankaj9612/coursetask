public class  Bottle1 {
    String brand;
    String color;
    double price;
    int cap;

    Bottle1()
    {

    }

    Bottle1(String brand,String color,double price,int cap)
    {
        this.brand=brand;
        this.color=color;
        this.price=price;
        this.cap=cap;
    }

    public void displayBottle()
    {
        System.out.println(brand);
        System.out.println(price);
        System.out.println(color);
        System.out.println(cap);
    }
}
