package curriculum.k;

public class SalaryReporter {
	
	public void printSalary(Payable employee) {
		System.out.println(
				employee.getName() + "の給料は" + employee.calculateSalary() + "円");
	}

}
