package Interface;

public class Volvo extends Vehicle implements Driver {
	
	private double price;
	
	
    public void startEngine()
    {
	System.out.println(" Thanks");
    }
	
	public void stopEngine()
	{
		System.out.println("Welcome");
	}
	
	public Volvo(String a,double b)
	{
		super(a);
		this.price = b;
	}
	
	
	public void move()
	{
		System.out.println("Moves Faster");
	}
	
	
	public static void main(String[] args) {
		
		
		Volvo v = new Volvo("Volvo", 2000);
		
		System.out.println("Price = " + v.price);
		
		System.out.println("Price = " + v.model);
		
		v.move();
		
		
		
		v.startEngine();
		v.stopEngine();
		
				
		
		
	}

}
