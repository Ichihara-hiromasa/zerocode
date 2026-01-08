package curriculum.d;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Question7 {

	public static Daemon loadDaemon(String filename) throws Exception {

		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

			String name = br.readLine();
			String[] status = br.readLine().split(" ");

			int hp = Integer.parseInt(status[0]);
			int at = Integer.parseInt(status[1]);
			int sp = Integer.parseInt(status[2]);

			return new Daemon(name, hp, at, sp);
		}
	}

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.print("プレイヤー名を入力してください:");

		String playerName = sc.nextLine();

		Player player = new Player(playerName);

		Daemon daemon = loadDaemon("daemon_status.txt");

		PrintWriter log = new PrintWriter(new FileWriter("battle_log.txt"));

		log.println("=== Battle Start ===");
		log.println(player.getStatus());
		log.println(daemon.getStatus());
		log.println();

		Random rand = new Random();

		Character attacker;
		Character defender;

		if (player.sp > daemon.sp) {
			attacker = player;
			defender = daemon;
		} else if (player.sp < daemon.sp) {
			attacker = daemon;
			defender = player;
		} else {
			attacker = rand.nextBoolean() ? player : daemon;
			defender = (attacker == player) ? daemon : player;
		}

		log.println("先攻" + attacker.name);
		log.println();

		while (player.isAlive() && daemon.isAlive()) {

			log.println(attacker.name + "の攻撃");
			attacker.attack(defender);
			log.println(defender.getStatus());
			log.println();

			if (!defender.isAlive())
				break;

			Character tmp = attacker;
			attacker = defender;
			defender = tmp;
		}

		log.println("=== Battle Result ===");
		if (player.isAlive()) {
			log.println("勝者:" + player.name);
		} else {
			log.println("勝者:" + daemon.name);
		}

		log.close();
		sc.close();

	}

}
