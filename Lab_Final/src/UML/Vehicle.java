package UML;

public class Vehicle {
	
	private String regNo;
	private String make;
	private int yearOfManufacture;
	private double value;
	
	public Vehicle (String a, String b, int c, double d)
	{
		this.regNo=a;
		this.make=b;
		this.yearOfManufacture = c;
		this.value = d;
	}
	


	public String getRegNumber()
	{
		return regNo;
	}
	
	public String getMake()
	{
		return make;
	}
	
	public int getYear()
	{
		return yearOfManufacture;
	}
	
	public double getValue()
	{
		return value;
	}
    
	public double setValue()
	{
		this.value = value;
		return value;
		}

public int calculateAge()
{
	return 0;
}


}
