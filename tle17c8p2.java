import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class tle17c8p2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || !st.hasMoreTokens()) {st = new StringTokenizer(br.readLine());}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		double hp = nextInt(); // what is broken who knows something is broken why is it broken
		Defender[] modes = new Defender[nextInt()];
		Enemy[] ships = new Enemy[nextInt()];

		for (int i = 0; i < modes.length; i++) {
			modes[i] = new Defender(nextInt(), nextInt());
		}

		int endTime = -1;
		for (int i = 0; i < ships.length; i++) {
			ships[i] = new Enemy(nextInt(), nextInt(), nextInt());
			endTime = Math.max(ships[i].endTime, endTime);
		}

		for (int i = 0; i <= endTime; i++) {
			int totalDamage = 0;
			for (Enemy ship : ships) {
				if (i >= ship.startTime && i < ship.endTime) totalDamage += ship.damage;
			}

			double reduced = Integer.MAX_VALUE;
			for (Defender mode : modes) {
				reduced = Math.min((Math.max(totalDamage-mode.shield, 0)) * (100-mode.armour) / 100.0, reduced); // be careful with floating point accuracy
				if (reduced < 0) System.out.println("something is broken");
			}

			hp -= reduced;
		}

		System.out.println(hp > 0 ? String.format("%.2f", Math.round(hp*100) / 100.0) : "DO A BARREL ROLL!");
	}

	static class Enemy {
		int damage, startTime, endTime;
		public Enemy(int startTime, int duration, int damage) {
			this.damage = damage;
			this.startTime = startTime;
			this.endTime = startTime + duration;
		}
	}

	static class Defender {
		int armour, shield;
		public Defender(int armour, int shield) {
			this.armour = armour;
			this.shield = shield;
		}
	}
}