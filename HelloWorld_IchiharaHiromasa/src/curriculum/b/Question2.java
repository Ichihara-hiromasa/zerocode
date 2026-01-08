package curriculum.b;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		/*
		 * [概要]int型の変数scoreに75を代入し、scoreが60以外なら”合格です！”と表示する処理
		 */

		int score = 75;
		if (score >= 60) {
			System.out.println("合格です！");
		}

		/*
		 * [概要]int型の変数ageに25を代入し、ageが20以上30以下なら”適正年齢です”と表示し、それ以外の場合は”対象外です”と表示する処理
		 */

		int age = 25;
		String result = (age >= 20 && age <= 30) ? "適正年齢です" : "対象外です";
		System.out.println(result);

		/*
		 * [概要]int型の変数ageに18を代入し、年齢を判定して”成人です”、”ティーンエイジャーです”、”子供です”のいずれかを表示する処理
		 */

		int age2 = 18;
		if (age2 >= 20) {
			System.out.println("成人です");
		} else if (age2 >= 13) {
			System.out.println("ティーンエイジャーです");
		} else {
			System.out.println("子供です");
		}

		/*
		 * [概要]int型の変数に数字を代入し、一番大きい数値を判定して表示する処理
		 */

		int x = 30;
		int y = 15;
		int z = 50;
		if (x > y && x > z) {
			System.out.println(x);
		} else if (y > z) {
			System.out.println(y);
		} else {
			System.out.println(z);
		}

		/*
		 * [概要]int型の変数numを用意し、コンソール入力でいずれかの値を入力し、値に合わせて判定を表示する処理
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("num:");
		int num = Integer.parseInt(scanner.nextLine());
		if (num > 0) {
			System.out.println("正の数です");
		} else if (num == 0) {
			System.out.println("0です");
		} else {
			System.out.println("負の数です");
		}

		/*
		 * [概要]int型の変数valueを用意し、コンソール入力でいずれかの値を代入し、偶数、奇数を判定する処理
		 */

		System.out.print("value:");
		int value = Integer.parseInt(scanner.nextLine());
		String result2 = (value % 2 == 1) ? "奇数です" : "偶数です";
		System.out.println(result2);

		/*
		 * [概要]int型の変数scoreにコンソール入力で0から100のいずれかの数値を代入し、判定を表示する処理
		 */

		System.out.print("score:");
		int score2 = Integer.parseInt(scanner.nextLine());
		if (score2 >= 90) {
			System.out.println("優");
		} else if (score2 >= 70) {
			System.out.println("良");
		} else if (score2 >= 50) {
			System.out.println("可");
		} else {
			System.out.println("不可 ");
		}

		/*
		 * [概要]コンソール入力がnullまたは空文字（””）の時に「入力が無効です」と表示する処理
		 */

		System.out.print("入力:");
		String input = scanner.nextLine();
		if (input == null || input.isEmpty()) {
			System.out.println("入力は無効です");
		} else {
			System.out.println("入力は有効です");
		}

		/*
		 * [概要]int型の変数dayを用意し、コンソール入力の値に応じて曜日を表示する処理
		 */

		System.out.print("曜日:");
		int day = scanner.nextInt();
		switch (day) {
		case 1:
			System.out.println("月曜日");
			break;
		case 2:
			System.out.println("火曜日");
			break;
		case 3:
			System.out.println("水曜日");
			break;
		case 4:
			System.out.println("木曜日");
			break;
		case 5:
			System.out.println("金曜日");
			break;
		case 6:
			System.out.println("土曜日");
			break;
		case 7:
			System.out.println("日曜日");
			break;
		default:
			System.out.println("無効な値です");
		}

		/*
		 * [概要]int型の変数monthを用意し、コンソール入力の値に応じて季節を表示する処理
		 */

		System.out.print("月:");
		int month = scanner.nextInt();
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("冬");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("春");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋");
			break;
		default:
			System.out.println("無効な月です");
		}

		scanner.close();

		// TODO 自動生成されたメソッド・スタブ

	}

}
