package application;

public class Medical {
	String Doctor;
	String nurse;
	String warden;
	String labname;
	int labno;
	int docid;
	String patients;
	
	Medical()
	{
		
	}
	
	Medical(String Docotr,String nurse,String warden,String labname)
	{
		this.Doctor=Doctor;
		this.nurse=nurse;
		this.warden=warden;
		this.labname=labname;
	}
	
	Medical(String Doctor,String nurse,String warden,String labname,int labno)
	{
		this(Doctor,nurse,warden,labname);
		this.labno=labno;
	}
	
	Medical(String Doctor,String nurse,String warden,String labname,int labno,int docid)
	{
		this(Doctor,nurse,warden,labname,labno);
		this.docid=docid;
	}
	
	public void displayInfo()
	{
		System.out.println(Doctor);
		System.out.println(nurse);
		System.out.println(warden);
		System.out.println(labname);
		System.out.println(labno);
		System.out.println(docid);
		System.out.println(patients);
	}
}
