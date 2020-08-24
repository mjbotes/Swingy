package Swingy.model;

public class GameWizzard {

    private HeroGod god = new HeroGod();
    private int mapSize;
    private Villain[] villians;
    private int nVillians = 5;

    public GameWizzard(int size){
        mapSize = size;
        god = new HeroGod();
    }

    public void heroBirth(String type, String name) {
        god.makeHero(name, type, (int) mapSize/2 - 1, (int) mapSize/2 - 1);
    }

    public void villianGen() {
        for (int i = 0; i < this.nVillians; i++) {
            villians[i] = new Villain(Math.random(), size);
        }
    }
    
}