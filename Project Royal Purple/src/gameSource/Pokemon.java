package gameSource;

public class Pokemon {
	private static int hitPoints, experience, attack, defense, specialAttack, specialDefense, speed, level, evolve, friendliness, pokedex;
	private static int evHitPoints, evAttack, evDefense, evSpecialAttack, evSpecialDefense, evSpeed, totalExperience, experienceCap;
	private static String name, nickname, displayName;
	private static double experienceModifier;
	public Pokemon(String n, int h, int a, int d, int sA, int sD, int s, int evH, int evA, int evD, int evSA, int evSD, int evS, int l, int e, int f, int pid) {
		name = n;
		nickname = n;
		displayName = n;
		level = l;
		evolve = e;
		friendliness = f;
		pokedex = pid;
		
		hitPoints = h;
		attack = a;
		specialAttack = sA;
		defense = d;
		specialDefense = sD;
		speed = s;
		
		totalExperience = 0;
		experienceModifier = 1.6;
		
		evHitPoints = evH;
		evAttack = evA;
		evSpecialAttack = evSA;
		evDefense = evD;
		evSpecialDefense = evSD;
		evSpeed = evS;
	}
	public void addExperience(int exp) {
		totalExperience += exp;
		if(totalExperience >= experienceCap && level == 100) {
			totalExperience = experienceCap;
		}
		else if(totalExperience >= experienceCap) {
			totalExperience -= experienceCap;
			levelUp();
		}
	}
	public void levelUp() {
		hitPoints += evHitPoints;
		attack += evAttack;
		specialAttack += evSpecialAttack;
		defense += evDefense;
		specialDefense += evSpecialDefense;
		speed += evSpeed;
		level++;
	}
	public void setNickname(String n) {
		nickname = n;
		displayName = n;
	}
	public static String getName() {
		return name;
	}
	public static String getNickName() {
		return nickname;
	}
	public static int getLevel() {
		return level;
	}
	public static int getTotalExperience() {
		return totalExperience;
	}
	public static int getExperienceCap() {
		return experienceCap;
	}
}
