package curriculum.h;

public abstract class Employee {
	
	// フィールドの作成
	protected String employeeId;
	protected String name;
	
	public Employee(String id, String name) {
		this.employeeId = id;
		this.name = name;
	}
	
	// getterメソッド
	public String getEmployeeId() {
		return employeeId;
	}
	public String getName() {
		return name;
	}
	
	// 抽象メソッド
	public abstract int calculateDailyWage(int hoursWorked);

}
