package curriculum.b;

public class Question5 {

	public static void main(String[] args) {
		
		/*
		 * Q1[概要]引数なし、戻り値なしで"Hello,World!"を表示するメソッドを作成
		 */
		
		helloWorld();
		
		/*
		 * Q2[概要]引数:整数(int num)、戻り値:整数(引数の2倍の値)で表示するメソッドを作成
		 */
		
		int num = 10;
		int result = doubleValue(num);
		System.out.println(num + "を２倍すると" + result + "です。");
		
		/*
		 * Q3[概要]引数:整数(int num)、戻り値:true(偶数なら)、false(奇数なら)で表示するメソッドを作成
		 */
		
		int num1 = 7;
		int num2 = 10;
		
		if (isEven(num1)) {
			System.out.println(num1 + "は偶数です。");
		} else {
			System.out.println(num1 + "は奇数です。");
		}
		
		if (isEven(num2)) {
			System.out.println(num2 + "は偶数です。");
		} else {
			System.out.println(num2 + "は奇数です。");
		}
		// TODO 自動生成されたメソッド・スタブ

	}

	public static void helloWorld() {
		System.out.println("Hello,World!");
	}
	
	public static int doubleValue(int num) {
		return num * 2;
	}
	
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}
}
