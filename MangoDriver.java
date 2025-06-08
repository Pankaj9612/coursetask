class MangoDriver
{
	public static void main(String[] args) {
		Mango m1= new Mango();

		System.out.println(m1);

		m1.name="Hapus";
		m1.price=1000;
		m1.origin="Ratanagiri";

		m1.printName().printOrigin().printPrice();
	}
}
