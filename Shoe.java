class Shoe
{
    String brand;
    double price;
    int size;
    String type;
    String color;

    Shoe()
    {
        brand="yahooo!";
        System.out.println("From no argument constructor..");
    }

    Shoe(String brand,double price,int size,String type,String color)
    {
        this.brand=brand;
        this.price=price;
        this.size=size;
        this.type=type;
        this.color=color;
    }

    public void displayShoe()
    {
        System.out.println(brand);
        System.out.println(price);
        System.out.println(size);
        System.out.println(type);
        System.out.println(color);
    }
}