package Swingy.model;

public class Villain {
	private String type;
	private HeroGod god;

	public Villain(int nType, int size) {
		this.type = type;
		int x = (int) Math.round(Math.random() * size);
		int y = (int) Math.round(Math.random() * size);
		god = new HeroGod();
		god.makeHero("Enemy", type, x, y);
	}


}