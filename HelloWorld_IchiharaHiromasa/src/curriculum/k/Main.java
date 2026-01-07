package curriculum.k;

public class Main {

	public static void main(String[] args) {
		
		Payable e1 = new FullTimeEmployee("佐藤", 9);
		Payable e2 = new ContractEmployee("田中", 9);
		
		SalaryReporter reporter = new SalaryReporter();
		
		reporter.printSalary(e1);
		reporter.printSalary(e2);
		// TODO 自動生成されたメソッド・スタブ

	}

}
