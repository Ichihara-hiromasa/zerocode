package curriculum.j;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Billable> employees = new ArrayList<>();
		
		employees.add(new FullTimeEmployee("F001", "佐藤"));
		employees.add(new FullTimeEmployee("F002", "鈴木"));
		employees.add(new ContractEmployee("C001", "田中"));
		employees.add(new ContractEmployee("C002", "高橋"));
		
		for (Billable b : employees) {
			int wage = b.costForDay(9);
			System.out.println("日給:" + wage + "円");
		}
		// TODO 自動生成されたメソッド・スタブ

	}

}
