package application;

public class Student 
{
		private String universityName;
		private String NameOfInstitute;
		private long enrollmentno;
		private String CandidateName;
		private String FatherName;
		private String motherName;
		private String address;
		private String emailId;
		private long mobileno;
		private double fess;
		
		
		Student()
		{
		}
		
		Student(String universityName,String NameOfInstitute,long enrollmentno,String CandidateName,String FatherName,
				String motherName,String address,String emailId,long mobileno,double fess)
		{
			this.universityName=universityName;
			this.NameOfInstitute=NameOfInstitute;
			this.enrollmentno=enrollmentno;
			this.CandidateName=CandidateName;
			this.FatherName=FatherName;
			this.motherName=motherName;
			this.address=address;
			this.emailId=emailId;
			this.mobileno=mobileno;
			this.fess=fess;
		}
		
		public String universityName()
		{
			return universityName;
		}
		
		public String NameOfInstitute()
		{
			return NameOfInstitute;
		}
		
		public long enrollmentno()
		{
			return  enrollmentno;
		}
		
		public String CandidateName()
		{
			return CandidateName;
		}
		
		public String FatherName()
		{
			return FatherName;
		}
		
		public String motherName()
		{
			return motherName;
		}
		
		public String address()
		{
			return address;
		}
		
		public String emailId()
		{
			return emailId;
		}
		
		public long mobileno()
		{
			return mobileno;
			
		}
		
		public double fess()
		{
			return fess;
		}
		
		public void displayinfo()
		{
			System.out.println(universityName);
			System.out.println(NameOfInstitute);
			System.out.println(enrollmentno);
			System.out.println(CandidateName);
			System.out.println(FatherName);
			System.out.println(motherName);
			System.out.println(address);
			System.out.println(emailId);
			System.out.println(mobileno);
			System.out.println(fess);
			
		}
		
}
