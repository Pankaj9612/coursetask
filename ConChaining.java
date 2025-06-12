package application;

public class ConChaining 
{
	
		String name;
		int age;
		long phno;
		String email;
		String location;
		String blood;
		long tel;
		String temploc;
		
		ConChaining ()
		{
		}
		
		ConChaining (String name,int age,long phno,String email,String loc)
		{
			this.name=name;
			this.age=age;
			this.phno=phno;
			this.email=email;
			location=loc;
		}
		
		ConChaining (String name,int age,long phno,String email,String loc,String blood)
		{
			this(name,age,phno,email,loc);
			this.blood=blood;
		}
		
		ConChaining (String name,int age,long phno,String email,String loc,String blood,long tel)
		{
			this(name,age,phno,email,loc,blood);
			this.tel=tel;
		}
		ConChaining (String name,int age,long phno,String email,String loc,String blood,long tel,String temploc)
		{
			this(name,age,phno,email,loc,blood,tel);
			this.temploc=temploc;
		}
		 
		public void displayForm()
		{
			System.out.println("name: " +name);
			System.out.println("age: " +age);
			System.out.println("email: " +email);
			System.out.println("location: " +location);
			System.out.println("blood: " +blood);
			System.out.println("tel: " +tel);
			System.out.println("temploc: " +temploc);
		}
	}
