package curriculum.i;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new FullTimeEmployee("F001", "田中"));
		employees.add(new FullTimeEmployee("F002", "佐藤"));
		employees.add(new ContractEmployee("C001", "鈴木"));
		employees.add(new ContractEmployee("C002", "高橋"));
		
		for (Employee e : employees) {
			int wage = e.calculateDailyWage(9);
			System.out.println(e.name + "の給与:" + wage + "円");
		}
		// TODO 自動生成されたメソッド・スタブ

	}

}
