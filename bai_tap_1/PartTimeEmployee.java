package bai_tap_1;

public class PartTimeEmployee extends Employee implements IEmployee {
	private int workingHours;
	public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
		super(name, paymentPerHour);
		this.workingHours = workingHours;
	}
	@Override 
	public int calculateSalary() {
		return paymentPerHour * workingHours;
	}
}
