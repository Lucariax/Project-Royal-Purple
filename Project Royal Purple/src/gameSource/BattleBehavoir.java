package gameSource;

import java.time.LocalDateTime;

public class BattleBehavoir {
	private static int time24;
	private static LocalDateTime ldt;
	public BattleBehavoir() {
		ldt = LocalDateTime.now();
		time24 = ldt.getHour();
	}
	public static void setBattleBackground() {
		if(time24 >= 6 && time24 <= 11) {
			// TODO: Would set the battle background to an early morning-type scene.
		} else if(time24 >= 12 && time24 <= 16) {
			// TODO: Would set the battle background to a noon-type scene.
		} else if(time24 >= 17 && time24 <= 8) {
			// TODO: Would set the battle background to an evening-type scene.
		} else {
			// TODO: Would set the battle background to a night-type scene.
		}
	}
}
