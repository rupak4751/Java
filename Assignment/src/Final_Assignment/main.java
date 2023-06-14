package Final_Assignment;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee[] employees = new Employee[4];
		
		employees[0] = new Professor(123 , " Nasima Islam Bithi ", 20000, " OOP ");
		
		employees[1] = new Professor(123 , " Nadira Anzum Nipa ", 20000, " PPS ");

		employees[2] = new Administrator(456 , " Dr. Tuuhid BHuiyan ", 22000, "  CSE ");
		
		employees[3] = new SupportStaff(789 , " Fahim Tahmid Rupak ", 10000, " IT Support ");
		
		for(Employee employee: employees)
		{
			System.out.println(employee.toString() + "\n");
		}
		
		double totalSalary = Employee.totalSalary(employees);
		System.out.println("\nTotal Salary = " + totalSalary);


	}

}
