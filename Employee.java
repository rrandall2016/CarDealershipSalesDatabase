package car_dealership;

// handleCustomer( Customer cust, boolean finance, Vehicle vehicle)//
// if(finance == true)
//    runCreditHistory(Customer cust, double doubleAmount)
// else if (vehicle.getPrice() <= cust.getCashOnHand()):
//      processTransaction(Customer cust, Vehicle vehicle)
// else:
//      tell customer to bring more money
public class Employee {



	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		if(finance == true) {
			double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
			runCreditHistory(cust, loanAmount);
		} else if(vehicle.getPrice() <= cust.getCashOnHand()) {
			//customer pays in cash
			processTransaction(cust,vehicle);
		} else {
			System.out.println("Customer will need more money for vehicle:  "+ vehicle);
		}
		
		
	}
	
	public void runCreditHistory(Customer cust, double loanAmount) {
		System.out.println("Ran credit history for Customer");
		System.out.println("Customer has been approved for this vehicle");	
	}
	
	public void processTransaction(Customer cust, Vehicle vehicle) {
		System.out.println("Customer paid in cash: " + vehicle + " for the price "+ vehicle.getPrice());
	}
}
