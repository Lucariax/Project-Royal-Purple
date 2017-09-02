package gameSource;

public class BattleMove {
	private static int power, accuracy, pp;
	private static String name, type, category;
	
	public BattleMove(String n, String t, String c, int p, int a, int p2) {
		name = n;
		type = t;
		category = c;
		power = p;
		accuracy = a;
		pp = p2;
	}
}
