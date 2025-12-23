package curriculum.b;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		/*
		 * Q1[概要]for文を使って1から10までの数字を1つずつ表示する処理
		 */
		
		for (int num = 1; num <= 10; num++) {
			System.out.println(num);
		}
		
		/*
		 * Q2[概要]for文を使って2から20までの偶数を1つずつ表示する処理
		 */
		
		for (int num2 = 2; num2 <= 20; num2 += 2) {
			System.out.println(num2);
		}
		
		/*
		 * Q3[概要]for文を使って10から1までカウントダウンする処理
		 */
		
		for (int num3 = 10; num3 >= 1; num3--) {
			System.out.println(num3);
		}
		
		/*
		 * Q4[概要]for文を使って1から100までの合計を表示する処理
		 */
		
		int sum = 0;
		for (int num4 = 1; num4 <= 100; num4++) {
			sum += num4;
		}
			System.out.println(sum);
		
		/*
		 * Q5[概要]for文を使って三角形を出力する処理
		 */
		
		String [] strs = {"*", "**", "***", "****", "*****"};
		for (String str : strs) {
			System.out.println(str);
		}
		
		/*
		 * Q6[概要]while文を使って1から10までを1つずつ表示する処理
		 */
		
		int num6 = 1;
		while (num6 <= 10) {
			System.out.println(num6);
			num6++;
		}
		
		/*
		 * Q7[概要]while文を使って2から20までの偶数を１つずつ表示する処理
		 */
		
		int num7 = 2;
		while (num7 <= 20) {
			System.out.println(num7);
			num7 += 2;
		}
		
		/*
		 * Q8[概要]while文を使って10から1までのカウントダウンを表示する処理
		 */
		
		int num8 = 10;
		while (num8 >= 1) {
			System.out.println(num8);
			num8--;
		}
		
		/*
		 * Q9[概要]while文を使って1から100までの合計を表示する処理
		 */
		
		int sum9 = 0;
		int num9 = 1;
		while (num9 <= 100) {
			sum9 += num9;
			num9++;
		}
		System.out.println(sum9);
		
		/*
		 * Q10[概要]ユーザーから数値をコンソール入力してもらい、
		 * 入力が0になるまで何度でも入力を受け付け、
		 * 0が入力されたら「終了しました」と表示する処理
		 */
		
		Scanner scanner = new Scanner(System.in);
		int num10 = 1;
		while (num10 != 0) {
			System.out.print("入力:");
			num10 = scanner.nextInt();
			if (num10 == 0) {
				System.out.println("終了しました");
			}
		}
		
		/*
		 * Q11[概要]for文を使用して九九の表を出力する処理
		 */
		
		for (int x = 1; x <= 9; x++) {
			for (int y = 1; y <= 9; y++) {
				System.out.printf("%02d * %02d = %02d", x, y, x * y);
				if (y != 9) {
					System.out.print(" || ");
				}
			}
			System.out.println();
		}
		// TODO 自動生成されたメソッド・スタブ

	}

}
