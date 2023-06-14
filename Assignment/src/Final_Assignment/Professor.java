package Final_Assignment;

public class Professor extends Employee {
	
	private String SubjectOfExpertise;
	
	public Professor (int employeeID, String name, double salary, String SubjectOfExpertise)
	{
		super(employeeID,name,salary);
		this.SubjectOfExpertise = SubjectOfExpertise;
		
	}
	
	public String getSubjectOfExpertise()
	{
		return SubjectOfExpertise;
	}
	
	public String toString()
	{
		return super.toString() + "\nSubject :" + SubjectOfExpertise;
	}

}
