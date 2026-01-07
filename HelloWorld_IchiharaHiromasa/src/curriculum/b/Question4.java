package curriculum.b;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		/*
		 * Q1[概要]int型の配列を作成し、1~5を格納し、配列の全要素を順番に表示する処理
		 */
		
		int[] numbers = {1, 2, 3, 4, 5};
		for (int num = 0; num < numbers.length; num++) {
			System.out.println(numbers[num]);
		}
		
		/*
		 * Q2[概要]int型の配列{10,20,30,40,50}を用意し、配列の要素を逆順に表示する処理
		 */
		
		int[] numbers2 = {10, 20, 30, 40, 50};
		for (int num2 = numbers2.length - 1; num2 >= 0; num2--) {
			System.out.println(numbers2[num2]);
		}
		
		/*
		 * Q3[概要]int型の配列{3,5,7,9,11}を用意し、配列の全要素の合計値を計算し表示する処理
		 */
		
		int[] numbers3 = {3, 5, 7, 9, 11};
		int sum = 0;
		for (int num3 = 0; num3 < numbers3.length; num3++) {
			sum += numbers3[num3];
		}
		System.out.println(sum);
		
		/*
		 * Q4[概要]int型の配列{12,7,9,21,5,18}を用意し、配列の最大値と最小値を求めて表示する処理
		 */
		
		int[] numbers4 = {12, 7, 9, 21, 5, 18};
		
		int max = numbers4[0];
		int min = numbers4[0];
		
		for (int num4 = 1; num4 < numbers4.length; num4++) {
			if (max < numbers4[num4]) {
				max = numbers4[num4];
			} 
			if (min > numbers4[num4]) {
				min = numbers4[num4];
			}
		}
		System.out.println("最大値:" + max);
		System.out.println("最小値:" + min);
		
		/*
		 * Q5[概要]int型の整列{1,2,3,4,5}を用意し、配列の全ての要素を2倍し、結果を拡張for文を使用して表示する処理
		 */
		
		int[] numbers5 = {1, 2, 3, 4, 5};
		for (int num5 : numbers5) {
			System.out.println(num5 *2);
		}
		
		/*
		 * Q6[概要]int型の配列{4,7,10,15,20}を用意し、ユーザーがコンソール入力した数が配列に含まれているかを判定し、結果を表示する処理
		 */
		
		int[] numbers6 = {4, 7, 10, 15, 20};
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("入力:");
		int input = scanner.nextInt();
		
		boolean found = false;
		
		for (int num6 :numbers6) {
			if (num6 == input) {
				found = true;
				break;
			}
		}
		
		if (found) {
			System.out.println(input + "は配列に含まれています");
		} else {
			System.out.println(input + "は配列に含まれていません");
		}
		
		scanner.close();
		
		/*
		 * Q7[概要]2次元配列　int[][]array ={{1,2},{3,4},{5,6}};を用意し、配列の全ての要素を表示する処理
		 */
		
		int[][] array = {
				{1, 2},
				{3, 4},
				{5, 6}
		};
		
		for (int num7 = 0; num7 < array.length; num7++) {
			for (int num7b = 0; num7b < array[num7].length; num7b++) {
				System.out.print(array[num7][num7b] + " ");
			}
			System.out.println();
		}
		
		/*
		 * Q8[概要]2次元配列int[][]array = {{10,20,30},{40,50,60},{70,80,90}}を用意し、配列の全ての要素の合計値を表示する処理
		 */
		
		int[][] array8 = {
				{10, 20, 30},
				{40, 50, 60},
				{70, 80, 90}
		};
		
		int sum8 = 0;
		for (int num8 = 0; num8 < array8.length; num8++) {
			for (int num8b = 0; num8b < array8[num8].length; num8b++) {
				sum8 += array8[num8][num8b];
			}
		}
		System.out.println(sum8);
		
		/*
		 * Q9[概要]2次元配列int[][]array = {{12,15,8},{6,19,25},{30,2,10}]を用意し、配列内の最大値と最小値を求めて表示する処理
		 */
		
		int[][] array9 = {
				{12, 15, 8},
				{6, 19, 25},
				{30, 2, 10}
		};
		
		int Max9 = array9[0][0];
		int Min9 = array9[0][0];
		
		for (int num9 = 0; num9 < array9.length; num9++) {
			for (int num9b = 0; num9b < array9[num9].length; num9b++) {
				if (array9[num9][num9b] > Max9) {
					Max9 = array9[num9][num9b];
				}
				if (array9[num9][num9b] < Min9) {
					Min9 = array9[num9][num9b];
				}
			}
		}
		
		System.out.println("最大値" + Max9);
		System.out.println("最小値" + Min9);
		
		/*
		 * Q10[概要]3次元配列int[][][]array = {{{1,2},{3,4}},{{5,6},{7,8}}};を用意して、配列内のすべての要素を表示
		 */
		
		int[][][] array10 = {
				{
					{1, 2}, {3, 4}
				},
				{
					{5, 6}, {7, 8}
				}
		};
		
		for (int numx = 0; numx < array10.length; numx++) {
			for (int numy = 0; numy < array10[numx].length; numy++) {
				for (int numz = 0; numz < array10[numx][numy].length; numz++) {
					System.out.println(array10[numx][numy][numz]);
				}
			}
			System.out.println();
		}
			// TODO 自動生成されたメソッド・スタブ
		
	}

}
