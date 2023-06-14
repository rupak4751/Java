package UML;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle vehicle = new Vehicle("RH123" , " HINO", 2020, 120000 );
		
		System.out.println("Registation Number " + vehicle.getRegNumber());
		System.out.println("Make By " + vehicle.getMake());
		System.out.println("Year of Manufacture " + vehicle.getYear());
		System.out.println("Value is " + vehicle.getValue());
		System.out.println(" ");
		
		SecondHandVehicle obj = new SecondHandVehicle("BH123" , " HINO", 2020, 120000, 3);
		
		
		System.out.println("Registation Number " + obj.getRegNumber());
		System.out.println("Make By " + obj.getMake());
		System.out.println("Year of Manufacture " + obj.getYear());
		System.out.println("Value is " + obj.getValue());
		System.out.println("Number of owner  is " + obj.getNumberOfOwners());
		
	}
}
