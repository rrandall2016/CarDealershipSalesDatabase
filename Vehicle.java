package car_dealership;

public class Vehicle {

	
		String model;
		String make;
		double price;
		
		public Vehicle(String model, String make, double price) {
			super();
			this.model = model;
			this.make = make;
			this.price = price;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public String getMake() {
			return make;
		}
		public void setMake(String make) {
			this.make = make;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Vehicle [model=" + model + ", make=" + make + ", price=" + price + "]";
		}
		
		
}
