package curriculum.k;

public class FullTimeEmployee extends Employee {
	
	private static final int HOURLY_RATE = 1200; 
	
	public FullTimeEmployee(String name, int hours) {
		super(name, hours);
	}
	
	@Override
	public int calculateSalary() {
		if(hours <= 8) {
			return hours * HOURLY_RATE;
		} else {
			int overtime = hours - 8;
			return 8 * HOURLY_RATE + (int)(overtime * HOURLY_RATE * 1.25);
		}
	}

}
