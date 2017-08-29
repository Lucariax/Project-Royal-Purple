package gameRun;
import gameSource.*;
public class GameMain {
	public static void main(String[] args) {
		TitleScreen royalPurple = new TitleScreen();
		GameGraphics g = new GameGraphics();
		g.keyListen();
	}
}
