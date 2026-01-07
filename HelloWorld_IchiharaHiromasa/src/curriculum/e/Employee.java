package curriculum.e;

public class Employee {
	
	private String name; // nameのフィールドを作成
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void work() {
		System.out.println(this.name + "は働いています。");
	}

}
