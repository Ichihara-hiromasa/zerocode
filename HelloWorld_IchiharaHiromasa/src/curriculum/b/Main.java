package curriculum.b;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Q4[概要]次の二つのクラスを作成し、MainクラスからGreetingクラスのメソッドを呼び出す処理
		 */
		
		Greeting greeting = new Greeting();
		greeting.sayHello();
		
		/*
		 * Q5[概要]次の２つのクラスを作成し、thisとsetterとgetterとフィールドを使ってコンソールに出力する処理
		 */
		
		Animal animal = new Animal();
		
		animal.setName("ライオン");
		animal.setLength(2.1);
		animal.setSpeed(80);
		
		System.out.println(
			"動物名:" + animal.getName() +
			"体調:" + animal.getLength() + "m" +
			"速度:" + animal.getSpeed() + "km/h"
		);		
		// TODO 自動生成されたメソッド・スタブ

	}

}
