package curriculum.g;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Q3[概要]javaプログラムを作成し、出力する
		 */
		
		Employee employee = new Employee(); // Employオブジェクトの生成
		
		// setメソッドで設定
		employee.setEmployeeId("E002");
		employee.setName("田中花子");
		
		// getメソッドで出力
		System.out.println("社員ID:" + employee.getEmployeeId() + ", 名前:" + employee.getName());
		// TODO 自動生成されたメソッド・スタブ

	}

}
