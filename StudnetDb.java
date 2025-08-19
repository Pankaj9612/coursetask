package application;

public class StudnetDb {

	private String user;
	private String pass;
	
	private Student[] sd=new Student[10];
	
	private boolean checklogin;
	private  int size;
	
	StudnetDb()
	{
		
	}

	public StudnetDb(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
		System.out.println("DB created!");
	}
	
	
	public boolean login(String user,String pass)
	{
		if(user==this.user && pass==this.pass)
		{
			checklogin=true;
			System.out.println("Login successfully!");
			return true;
		}
		System.out.println("Invalid credentials");
		return false;
	}
	
	
	public boolean addstudent(String name, String degree, int age, int roll, int marks)
	{
		if(checklogin)
		{
			if(size<sd.length*0.7)
			{
				sd[size]= new Student(name,degree,age,roll,marks);
				
				size++;
				System.out.println(name+" added successfully!");
				return true;
			}
			else
			{
				Student [] temp = new Student[sd.length*2];
				for(int i=0;i<size;i++)
				{
					temp[i]=sd[i];
				}
				
				sd=temp;
				
				sd[size]=new Student(name,degree,age,roll,marks);
				
				size++;
				System.out.println(name+" added successfully!");
				return true;
			}
		}
		
		System.out.println("Please login frist");
		return false;
		
	}
	
	public void printDb()
	{
		if(checklogin)
		{
			for(int i=0;i<size;i++)
			{
				System.out.println(sd[i]);
			}
		}
		else
		{
			System.out.println("Please login");
		}
	}
	
	public boolean searchbyName(String name)
	{
		if(checklogin)
		{
			for(int i=0;i<size;i++)
			{
				if(sd[i].name.equalsIgnoreCase(name))
				{
					System.out.println(name+"Student found");
					return true;
				}
			}
		}
		System.out.println(name +"student not found");
		return false;
	}
	
	public boolean searchbyroll(int roll)
	{
		if(checklogin)
		{
			for(int i=0;i<size;i++)
			{
				if(sd[i].roll==roll)
				{
					System.out.println("student found");
					return  true;
				}
			}
		}
		System.out.println("please Login");
		return false;
	}
	
	public boolean searchbymarks(int marks)
	{
		if(checklogin)
		{
			for(int i=0;i<size;i++)
			{
				if(sd[i].marks==marks)
				{
					System.out.println("found");
					return true;
				}
			}
		}
		System.out.println("Please Login");
		return false;
	}
	
	public boolean sortbyRoll()
	{
		if(checklogin)
		{
			for(int i=0;i<size-1;i++)
			{
				for(int j=0;j<size-1-i;j++)
				{
					if(sd[j].roll>sd[j+1].roll)
					{
					Student temp=sd[j];
					sd[j]=sd[j+1];
					sd[j+1]=temp;
					}
				}
			}
			System.out.println("Sorted successfully by roll number.");
			return true;
		}
		System.out.println("please login");
		return false;
	}
	
	public void sortbyname()
	{
		if(checklogin)
		{
			for(int i=0;i<size-1;i++)
			{
				for(int j=0;j<size-1-i;j++)
				{
					if(sd[j].name.compareToIgnoreCase(sd[j+1].name)>0)
					{
						Student temp=sd[j];
						sd[j]=sd[j+1];
						sd[j+1]=temp;
					}
				}
			}
		}
		else
		{
			System.out.println("Please login");
		}
	}
	
	public void sortbyMarks()
	{
		if(checklogin)
		{
			for(int i=0;i<size-1;i++)
			{
				for(int j=0;j<size-1-i;j++)
				{
					if(sd[j].marks>sd[j+1].marks)
					{
						Student temp=sd[j];
						sd[j]=sd[j+1];
						sd[j+1]=temp;
					}
				}
			}
		}
		else
		{
		System.out.println("Please login");
		}
	}
	
	public boolean removebyroll(int roll)
	{
		if(checklogin)
		{ 
			int index;
			int i;
			for( i=0;i<size;i++)
			{
				if(sd[i].roll==roll)
				{
					break;
				}
			}
			
			if(i<size)
			{
				Student [] temp= new Student[sd.length-1];
				for(int j=0;j<size;j++)
				{

					if(j<i)
					{
						temp[j]=sd[j];
					}
					else if(j>i)
					{
						temp[j-1]=sd[j];
					}
				}
				size--;
				
				sd=temp;
				
				System.out.println(roll +" removed from db");
				return true;
				}
			else
			{
				System.out.println("Student not found");
				return false;
			}
			
			}
		return false;
			
	}
	
	public boolean removebymarks(int marks)
	{
		if(checklogin)
		{ 
			int index;
			int i;
			for( i=0;i<size;i++)
			{
				if(sd[i].marks==marks)
				{
					break;
				}
			}
			
			if(i<size)
			{
				Student [] temp= new Student[sd.length-1];
				for(int j=0;j<size;j++)
				{

					if(j<i)
					{
						temp[j]=sd[j];
					}
					else if(j>i)
					{
						temp[j-1]=sd[j];
					}
				}
				size--;
				
				sd=temp;
				
				System.out.println(marks +" removed from db");
				return true;
				}
			else
			{
				System.out.println("Student not found");
				return false;
			}
			
			}
		return false;
			
	}
	
	public boolean removeByName(String name)
	{
		if(checklogin)
		{
			int i;
			for(i=0;i<size;i++)
			{
				if(sd[i].name.equals(name))
				{
					break;
				}
			}
			System.out.println(sd[i].name);
			
			if(i<size)
			{
				Student[] temp=new Student[sd.length-1];
				for(int j=0;j<size;j++)
				{
					if(j<i)
					{
						temp[j]=sd[j];
					}
					else if(j>i)
					{
						temp[j-1]=sd[j];
					}
				}
				size--;
				
				sd=temp;
				
				System.out.println(name +" removed from db");
				return true;
			}
		}
		else
		{
			System.out.println("Student not found");
			return false;
		}
	
			System.out.println("please login");
			return false;
	}

	
	public void highestmarks()
	{
		int i;
		int max=Integer.MIN_VALUE;
		int secmax=Integer.MIN_VALUE;
		for(i=0;i<size;i++)
		{
			if(sd[i].marks>max)
			{
				secmax=max;
				max=sd[i].marks;
			}
			else if(sd[i].marks>secmax && sd[i].marks!=max)
			{
				secmax=sd[i].marks;
			}
		}
		
		System.out.println(max);
		System.out.println(secmax);
	}
	
	public boolean removebyspecificmarks(int marks)
	{
		if(checklogin)
		{
			for(int i=0;i<size;i++)
			{
				if(sd[i].marks<50)
				{
					System.out.println(sd[i]);
				}
			}
			return true;
		}
		else
		{
			System.out.println("please login");
			return false;
		}
		
	}

	public boolean updatetherecord(String name,int roll)
	{
		if(checklogin)
		{
			for(int i=0;i<size;i++)
			{
				if(sd[i].name.equalsIgnoreCase(name))
				{
					sd[i].roll=roll;
				}
			}
			System.out.println("Updated");
			return true;
		}
		else
		{
			System.out.println("Not updated");
			return false;
		}
		
		
	}
	
		
	
	
}
