package application;

public class Developer extends SoftwareEngineer {
	
	String techStack;
	int project;
	String role;
	String domain;
	
	Developer()
	{
		
	}

	
	
	
	public Developer(String name, int empId, String company, String degree, int exp, double salary,
			String techStack, int project,String role,String domain) 
	{
		this.name=name;
		this.empId=empId;
		this.company=company;
		this.degree=degree;
		this.exp=exp;
		this.salary=salary;
		this.techStack=techStack;
		this.project=project;
		this.role=role;
		this.domain=domain;
	}
	
	public void displayDevloper()
	{
		displaySotwareEnginner();
		
		System.out.println(techStack);
		System.out.println(project);
		System.out.println(role);
		System.out.println(domain);
	}
	
	
	
	
}
