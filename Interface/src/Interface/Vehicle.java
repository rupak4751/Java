package Interface;

public abstract class Vehicle {
	
	protected String model;
	
	public Vehicle(String a)
	{
		this.model = a;
	}
	
	

	public abstract void move();
	
	
	public void controllSpeed()
	{
		
	}
}
