package application;

public class University {
	
	String uname;
	String vc;
	String uloc;
	int code;
	String utype;
	
	public University() {
		// TODO Auto-generated constructor stub
	}

	public University(String uname, String vc, String uloc, int code, String utype) {
		
		this.uname = uname;
		this.vc = vc;
		this.uloc = uloc;
		this.code = code;
		this.utype = utype;
	}
	
	public void displayUniversity()
	{
		System.out.println(uname);
		System.out.println(vc);
		System.out.println(uloc);
		System.out.println(code);
		System.out.println(utype);
	}
}
