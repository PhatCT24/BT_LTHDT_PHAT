package bai_tap_1;

public class FullTimeEmployee extends Employee implements IEmployee {

	public FullTimeEmployee(String name, int paymentPerHour) {
		super(name, paymentPerHour);
	}

	@Override
	public int calculateSalary() {
		return paymentPerHour * 192;
	}
	
}
