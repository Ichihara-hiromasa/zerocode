package curriculum.f;

public class Employee {
	
	private String employeeId; // employeeIdのフィールドを作成
	private String name; // nameのフィールドを作成
	
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("社員ID:" + this.employeeId + ", 名前:" + this.name);
	}

}
