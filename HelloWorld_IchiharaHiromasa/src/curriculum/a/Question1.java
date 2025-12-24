package curriculum.a;

public class Question1 {

	public static void main(String[] args) {
	
		/*
		 * [概要]各型の変数を宣言し、初期値を設定
		 */
		
		// 変数byteNumの初期値を設定
		byte byteNum = 0;	
		// 変数shortNumの初期値を設定
		short shortNum = 0;
		// 変数intNumの初期値を設定
		int intNum = 0;
		// 変数longNumの初期値を設定
		long longNum = 0L;
		// 変数floatNumの初期値を設定
		float floatNum = 0.0f;
		// 変数doubleNumの初期値を設定
		double doubleNum = 0.0;
		// 変数letterの初期値を設定
		char letter = '\u0000';
		// 変数lettersの初期値を設定
		String letters = null;
		// 変数isBooleanの初期値を設定
		boolean isBoolean = false;
		
		/*
		 * [概要]上記で宣言した各型の変数に指定された値を代入
		 */
		
		// 変数byteNumに10を代入
		byteNum = 10;
		// 変数shortNumに100を代入
		shortNum = 100;
		// 変数intNumに1000を代入
		intNum = 1000;
		// 変数longNumに10000を代入
		longNum = 10000;
		// 変数floatNumに9.5を代入
		floatNum = 9.5f;
		// 変数doubleNunに10.5を代入
		doubleNum = 10.5;
		// 変数letterに"a"を代入
		letter = 'a';
		// 変数lettersに"ハロー"を代入
		letters = "ハロー";
		// 変数isBooleanにtrueを代入
		isBoolean = true;
		
		/*
		 * [概要]値を代入した変数を用いて出力をする
		 */
		
		// 11110を出力
		System.out.println( longNum + intNum + shortNum + byteNum);
		// 20を出力
		System.out.println( byteNum + byteNum);
		// a ハロー trueを出力
		System.out.println( letter + letters + isBoolean);
		// 数字を全て足して出力
		System.out.println( byteNum + shortNum + intNum + longNum + floatNum + doubleNum);
		// 小数点以外の数字を全てかけて出力
		System.out.println( byteNum * shortNum * intNum * longNum);
		// 10.5割る100をして出力
		System.out.println( doubleNum / shortNum);
		// 10引く100をして出力
		System.out.println( byteNum - shortNum);
		
		/*
		 * [概要]nameというString型の変数を宣言し、”山田太郎”と代入し、変数を使用してコンソールにこんにちは、山田太郎さん！と表示する
		 */
		
		String name = "山田太郎";
		System.out.println( "こんにちは、" + name + "さん！");
		
		/*
		 * [概要]ageというint型の変数を宣言し、25を代入し、変数を使用してコンソールに年齢：25歳と表示する
		 */
		
		int age = 25;
		System.out.println( "年齢:" + age + "歳");
		
		/*
		 * [概要]num1とnum2というint型の偏数を宣言、値をそれぞれ代入し、二つを足した結果をsumという変数に代入しコンソールに表示する
		 */
		
		int num1 = 10;
		int num2 = 5;
		int sum = ( num1 + num2);
		System.out.println( sum);
		
		/*
		 * [概要]scoreというint型の変数を宣言し、80を代入し、20を加えて更新、最終スコア:100をscoreを使用してコンソールに表示する
		 */
		
		int score = 80;
		score = score + 20;
		System.out.println( "最終スコア:" + score);
		
		/*
		 * [概要]priceというdouble型の変数を宣言し、99.99を代入し、priceをint型に置換し、整数価格:99とコンソールに表示する
		 */
		
		double price = 99.99;
		int priceInt = (int) price;
		System.out.println( "整数価格:" + priceInt);
		
		/*
		 * [概要]String型の変数sumStrに"123"を代入し、sumStrをint型に変換し、変換後の値:の後ろにsumStr+10した結果をコンソールに表示する
		 */
		
		String numStr = "123";
		int numStrInt = Integer.parseInt(numStr);
		System.out.println( numStrInt + ":" + (numStrInt + 10));
		
		/*
		 * [概要]int型の変数numに50を代入し、numをString型に変換し、”特典:50点”の形で表示する
		 */
		
		int num = 50;
		String numIntStr = String.valueOf(num);
		System.out.println( "得点:" + numIntStr + "点");
		
		/*
		 * [概要]二つの変数a,bのaがbより小さいかどうかをboolean変数resultに代入し、値を表示するプログラムを作成する
		 */
		
		int a = 10;
		int b = 20;
		boolean result = ( a < b);
		System.out.println( result);
		
		/*
		 * [概要]条件演算子を利用し、int型の変数xに15を代入し、xが10以上なら”OK"、そうでなければ”NG"と表示する
		 */
		
		int x = 15;
		boolean bx= ( x >= 10);
		String s = bx ? "OK" : "NG";
		System.out.println(s);
		
		/*
		 * [概要]String text ="私はJavaが好きです。Javaは楽しい！";という文章の中にある「Java」を「Python」に置き換えて表示する
		 */
		
		String text = "私はJavaが好きです。Javaは楽しい！";
		String newText = text.replace("Java", "Python");
		System.out.println( text);
		
	}

}
