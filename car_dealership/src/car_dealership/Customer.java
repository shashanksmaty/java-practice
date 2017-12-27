package car_dealership;

public class Customer {
	
	private String name;
	private String address;
	private double cash;
	
	public Customer(String name, String address, double cash) {
		super();
		this.name = name;
		this.address = address;
		this.cash = cash;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getCash() {
		return cash;
	}

	public void setCash(double cash) {
		this.cash = cash;
	}

	public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance) {
		emp.handlePurchase(this, vehicle, finance);
	}
}
