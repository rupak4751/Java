package UML;

public class SecondHandVehicle extends Vehicle {
	
	private int numberOfOwners;
	
	public SecondHandVehicle(String a,String b,int c, double d, int e)
	{
		super(a,b,c,d);
		this.numberOfOwners = e;
	}
	
	public int getNumberOfOwners()
	{
		return numberOfOwners;
	}
	
	public double sellVehicle()
	{
		return 0;
	}

}
