package car_dealership;

public class Dealership {

	public static void main(String[] args) {

		Customer cust1 = new Customer();
		cust1.setName("Tom");
		cust1.setAddress("123 Anything st.");
		cust1.setCashOnHand(12000);
		
		Vehicle vehicle = new Vehicle("Honda", "Accord", 15000);

		Employee emp = new Employee();

		cust1.purchaseCar(vehicle, emp, false);
		
		Vehicle car = new Vehicle("BMW", "M3", 20000);
		
		car.equals(vehicle);
		boolean value = car.equals(vehicle);
		System.out.println(value);
		
				
		


	}

}
 