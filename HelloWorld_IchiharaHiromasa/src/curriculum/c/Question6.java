package curriculum.c;

import java.util.Random;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		while (true) {
			System.out.println("グー(0), チョキ(1), パー(2) を入力:"); // プレイヤーの入力を受け付ける
			int player = scanner.nextInt();

			int cpu = random.nextInt(3); // CPUの手を生成

			switch (player) {
			case 0:
				System.out.println("あなたの手:グー");
				break;
			case 1:
				System.out.println("あなたの手:チョキ");
				break;
			case 2:
				System.out.println("あなたの手:パー");
				break;
			default:
				System.out.println("不正な値です");
				continue;
			}

			switch (cpu) {
			case 0:
				System.out.println("CPUの手:グー");
				break;
			case 1:
				System.out.println("CPUの手:チョキ");
				break;
			case 2:
				System.out.println("CPUの手:パー");
				break;
			}

			if (player == cpu) {
				System.out.println("あいこです。もう一回");
				continue;
			}

			boolean isPlayerWin = (player == 0 && cpu == 1) ||
					(player == 1 && cpu == 2) ||
					(player == 2 && cpu == 0);

			if (isPlayerWin) {
				System.out.println("あなたの勝ち！");
				break;
			} else {
				System.out.println("あなたの負け！");
			}

		}

		scanner.close();
		// TODO 自動生成されたメソッド・スタブ

	}

}
