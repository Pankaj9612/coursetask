class Room 
{   
    String area;
    String name="Swami-Niwas";
    double price;
    double square;

    {
        System.err.println("hibssssssssssssssssssssssss");
    }
    public void displayRoomArea()
    {
        System.out.println("area:"+area);
    }

    Room()
    {
        System.err.println("Room Booking System...");
    }

    public void displayRoomName()
    {   
         String name="Radha-Krishna";
        System.out.println("name: "+this.name);
        System.err.println(this);
    }

    public void displayRoomDetails()
    {
        System.out.println("price: "+price);
        System.err.println("Square: "+square);
    }
}
