package selfintroduction;

class Main {

	public static void main(String[] args) {
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60); // 引数にweightの60を入れる(問題5)
		
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.height);
		System.out.println(person1.weight);
		
		person1.point();
		
		System.out.println("合計" + Person.count + "人です");
		// TODO 自動生成されたメソッド・スタブ

	}
	
}
