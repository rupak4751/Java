package interface2;

public class Apollo extends SpaceCraft implements Drive, Shuttle{
	
	private int nowheel;
	
	
	public Apollo(String a, int b) {
		
		super(a);
		this.nowheel = b;
}
	
	public  void display()
	{
		System.out.println("Display");
	}
	
	
    public void drive()
    {
    	System.out.println("Drive");
    }
	
	
	public void stop()
	{
		System.out.println("Stop");
	}
	
	public void turn()
	{
		System.out.println("Turn");
	}
	
	
	
    public void startShuttle()
    {
	     System.out.println("Start");
    }
	
	public void stopShuttle()
	{
		System.out.println("Stop");
	}
	
	
	
	
	public static void main(String[] args) {
		Apollo ap = new Apollo("accha", 10);
		
		System.out.println(ap.model);
		System.out.println(ap.nowheel);
		
		ap.display();
		ap.drive();
		ap.stop();
		ap.turn();
		ap.startShuttle();
		ap.startShuttle();
				
	}

	
	

}
