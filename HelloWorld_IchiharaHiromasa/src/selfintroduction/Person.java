package selfintroduction;

class Person {
	
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight; // インスタンスフィールド「weight」を定義(問題4)
	
	static int count = 0;
	
	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight; // コントラクタの中で値をセット(問題4)
		
		count++;
	}
	
	public double bmi() { // インスタンスメソッド「bmi」を定義(問題6)
		return this.weight / this.height / this.height; // bmiメソッドでインスタンスのBMIを返す(問題7)
	}
	
	public void point() { // インスタンスメソッド「」を定義(問題8）
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.printf("BMIは%.2fです\n", this.bmi());
	}

}
